/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rcobank.cli.project.UI;

import com.rcobank.cli.project.adapters.zipCode.ZipCodeAdapter;
import com.rcobank.cli.project.controllers.BankAccountController;
import com.rcobank.cli.project.domain.address.Address;
import com.rcobank.cli.project.domain.address.AddressBuilder;
import com.rcobank.cli.project.domain.bankAccount.AccountType;
import com.rcobank.cli.project.domain.bankAccount.CreateAnAccountDTO;
import com.rcobank.cli.project.domain.customer.CompanyCustomer;
import com.rcobank.cli.project.domain.customer.CompanyCustomerBuilder;
import com.rcobank.cli.project.domain.customer.CustomerType;
import com.rcobank.cli.project.domain.zipCode.ZipCode;
import com.rcobank.cli.project.ports.input.MenuPort;
import com.rcobank.cli.project.ports.output.CheckZipCodeUseCase;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author dev_rco
 */
public class MenuCLI implements MenuPort {
    private final Scanner scanner = new Scanner(System.in);
    private final BankAccountController bankAccountController;
    private final CheckZipCodeUseCase checkZipCodeUseCase;

    public MenuCLI(
        BankAccountController controller,
        CheckZipCodeUseCase checkZipCodeUseCase
        ) {
        bankAccountController = controller;
        this.checkZipCodeUseCase = checkZipCodeUseCase;
    }
    
    public void display() {
        MenuOptions option;
        Boolean isLoggedIn = false;
        do {
            if (isLoggedIn)
                this.loggedInAreaMenu();
            else
                this.openAreaMenu();

            System.out.print("|----> Informe sua escolha: ");
            option = MenuOptions.values()[scanner.nextInt()];
            this.processSelectedOption(option);
        } while (MenuOptions.EXIT != option);
        System.out.println("Sessão finalizada!");
        scanner.close();
    }

    @Override
    public void openAreaMenu() {
        System.out.println("_____________MENU_____________");
        System.out.println("|  1  | CADASTRAR NOVA CONTA |");
        System.out.println("|  2  | ACESSAR CONTA        |");
        System.out.println("|  10 | FINALIZAR            |");
        System.out.println("|____________________________|");
    }
    
    @Override
    public void loggedInAreaMenu() {
        System.out.println("____________MENU____________");
        System.out.println("| 3 | ALTERAR LIMITE       |");
        System.out.println("| 4 | SACAR                |");
        System.out.println("| 5 | TRANSFERIR           |");
        System.out.println("| 6 | DEPOSITAR            |");
        System.out.println("| 7 | PIX                  |");
        System.out.println("| 8 | CONSULTAR SALDO      |");
        System.out.println("| 9 | SAIR                 |");
        System.out.println("|__________________________|");
    }
    
    private void processSelectedOption(MenuOptions option) {
        System.out.println(option);
        try {
            switch (option) {
                case ACCESS_ACCOUNT:
                    this.registerAnAccount();
                    break;
                case EXIT:
                    System.out.println("Finalizando sessão...");
                    break;
                default:
                    System.out.println("Selecione uma opção válida...");
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    
    private void registerAnAccount() throws IOException {
        System.out.println("-> Iniciar cadastro de conta bancária -<");
        CustomerType customerType = getCustomerType();
        System.out.print("| Informe o número da agência: ");
        Integer agencyNumber = scanner.nextInt();
        System.out.print("| Informe o nome do cliente: ");
        String name = scanner.next();
        System.out.print("| Informe o documento de identificação do cliente: ");
        String identificationDocument = scanner.next();
        CompanyCustomerBuilder companyCustomerBuilder = new CompanyCustomerBuilder();
        Address address = this.getAddress();
        CompanyCustomer companyCustomer = companyCustomerBuilder.addId(1)
                .addIdentificationDocument(identificationDocument)
                .addAddress(address)
                .addFantasyName(name)
                .addCorporateReason("123 alguma coisa LTDA")
                .build();
        CreateAnAccountDTO account = new CreateAnAccountDTO(
                agencyNumber,
                10.0,
                100.0,
                AccountType.JOINT_ACCOUNT,
                companyCustomer
        );
        this.bankAccountController.createAnAccount(account);
    }

    private CustomerType getCustomerType() {
        System.out.println("| Qual o tipo do cliente?");
        System.out.println("| 1 Pessoa fisica");
        System.out.println("| 2 Pessoa jurídica");
        System.out.print("| Informe sua escolha: ");
        return CustomerType.values()[scanner.nextInt()];
    }

    private Address getAddress() throws IOException {
        AddressBuilder addressBuilder = new AddressBuilder();
        System.out.print("> Cadastrar dados do endereço <");
        System.out.print("| Informe o CEP: ");
        addressBuilder.addZipCode(scanner.next());
        ZipCode zipCode = checkZipCodeUseCase.verify(addressBuilder.getZipCode());
        System.out.println(zipCode);
        System.out.print("| Informe o país: ");
        addressBuilder.addCountry(scanner.next());
        addressBuilder.addDistrict(zipCode.getFederativeUnit());
        addressBuilder.addCity(zipCode.getCity());
        addressBuilder.addNeighborhood(zipCode.getNeighborhood());
        System.out.print("| Informe um ponto de referência: ");
        addressBuilder.addReferencePoint(scanner.next());
        System.out.print("| Informe o número da casa: ");
        addressBuilder.addLocationNumber(scanner.next());
        return addressBuilder.build();
    }

}
