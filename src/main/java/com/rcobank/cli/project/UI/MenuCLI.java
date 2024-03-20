/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rcobank.cli.project.UI;

import com.rcobank.cli.project.controllers.BankAccountController;
import com.rcobank.cli.project.domain.address.Address;
import com.rcobank.cli.project.domain.address.AddressBuilder;
import com.rcobank.cli.project.domain.bankAccount.AccountType;
import com.rcobank.cli.project.domain.bankAccount.CreateAnAccountDTO;
import com.rcobank.cli.project.domain.customer.CompanyCustomer;
import com.rcobank.cli.project.domain.customer.CompanyCustomerBuilder;
import com.rcobank.cli.project.domain.customer.Customer;
import com.rcobank.cli.project.domain.customer.CustomerPersonBuilder;
import com.rcobank.cli.project.domain.customer.CustomerType;
import com.rcobank.cli.project.domain.zipCode.ZipCode;
import com.rcobank.cli.project.ports.input.MenuPort;
import com.rcobank.cli.project.ports.output.CheckZipCodeUseCase;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
            option = MenuOptions.values()[scanner.nextInt()-1];
        
            this.processSelectedOption(option);
        } while (MenuOptions.FINISH != option);
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
                case CREATE_AN_ACCOUNT:
                    this.registerAnAccount();
                    break;
                case ACCESS_ACCOUNT:
                    System.out.println("Acessar conta...");
                    break;
                case CHANGE_LIMIT:
                    System.out.println("Alterar limite...");
                    break;
                case TO_WITHDRAW:
                    System.out.println("Sacar ...");
                    break;
                case TRANSFER:
                    System.out.println("Transferir dinheiro...");
                    break;
                case DEPOSIT:
                    System.out.println("Depositar...");
                    break;
                case PIX:
                    System.out.println("PIX...");
                    break;
                case CHECK_BALANCE:
                    System.out.println("Consultar saldo");
                    break;
                case EXIT:
                    System.out.println("Sair..");
                    break;
                case FINISH:
                    System.out.println("Finalizar ..");
                    break;
                default:
                    System.out.println("Selecione uma opção válida...");
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    
    private void registerAnAccount() throws IOException {
        CompanyCustomerBuilder companyCustomerBuilder = new CompanyCustomerBuilder();
        System.out.println("|__ Iniciar cadastro de conta bancária __|");
        AccountType accountType = getAccountType();
        CustomerType customerType = getCustomerType();
        System.out.print("| Informe o número da agência: ");
        Integer agencyNumber = scanner.nextInt();
        scanner.nextLine();
        
        Address address = this.getAddress();
    
        Customer customer = getCustomer(customerType);
        System.out.print("| Informe um telefone para contato: ");
        customer.setPhoneNumber(scanner.nextLine());
        customer.setAddress(address);

        CreateAnAccountDTO account = new CreateAnAccountDTO(
                agencyNumber,
                accountType,
                customer
        );
        this.bankAccountController.createAnAccount(account);
    }

    private AccountType getAccountType() {
        System.out.println("|__ Informe o tipo da conta __|");
        System.out.println("| 1 | Conta Corrente          |");
        System.out.println("| 2 | Conta Poupança          |");
        System.out.println("| 3 | Conta Salário           |");
        System.out.println("| 4 | Conta Conjunta          |");
        System.out.println("|-----------------------------|");
        System.out.print("| Informe sua escolha: ");
        AccountType accountType = AccountType.values()[scanner.nextInt()-1];
        System.out.println(accountType);
        scanner.nextLine();
        return accountType;
    }

    private CustomerType getCustomerType() {
        System.out.println("| Qual o tipo do cliente? |");
        System.out.println("| 1 Pessoa fisica         |");
        System.out.println("| 2 Pessoa jurídica       |");
        System.out.print("| Informe sua escolha: ");
        CustomerType customerType = CustomerType.values()[scanner.nextInt()-1];
        System.out.println(customerType);
        scanner.nextLine();
        return customerType;
    }

    private Address getAddress() throws IOException {
        AddressBuilder addressBuilder = new AddressBuilder();
        System.out.println("|__ Cadastrar dados do endereço __|");
        System.out.print("| Informe o CEP: ");
        addressBuilder.addZipCode(scanner.next());
        ZipCode zipCode = checkZipCodeUseCase.verify(addressBuilder.getZipCode());
        addressBuilder.addDistrict(zipCode.getFederativeUnit());
        addressBuilder.addCity(zipCode.getCity());
        addressBuilder.addNeighborhood(zipCode.getNeighborhood());
        addressBuilder.addPublicPlace(zipCode.getPublicPlace());
        System.out.println(zipCode);
        System.out.print("| O endereço está correto? 1 SIM e 2 NÃO: ");
        Integer confirmedAddress = scanner.nextInt();
        scanner.nextLine();
        
        if (confirmedAddress != 1) {
            addressBuilder = this.getBasicAddressData(addressBuilder);
        }

        addressBuilder = this.getAdditionalAddressData(addressBuilder);
        
        return addressBuilder.build();
    }

    private AddressBuilder getBasicAddressData(AddressBuilder address) {
        System.out.print("| Informe o CEP: ");
        address.addZipCode(scanner.next());
        System.out.print("| Informe a unidade federativa (UF): ");
        address.addCountry(scanner.next());

        scanner.nextLine();

        System.out.print("| Informe a cidade: ");
        address.addCity(scanner.nextLine());
        System.out.print("| Informe o bairro: ");
        address.addNeighborhood(scanner.nextLine());
        System.out.print("| Informe o logradouro: ");
        address.addPublicPlace(scanner.nextLine());
    
        return address;
    }

    private Customer getCustomer(CustomerType customerType) {
        Customer customer;
        if (customerType == CustomerType.PF) {
            customer = this.menuCustomerPerson();
        } else {
            customer = this.menuCompanyCustomer();
        }
        return customer;
    }

    private Customer menuCustomerPerson() {
        CustomerPersonBuilder personBuilder = new CustomerPersonBuilder();
        System.out.print("| Informe o CPF do cliente: ");
        personBuilder.addIdentificationDocument(scanner.nextLine());
        System.out.print("| Informe o primeiro nome do cliente: ");
        personBuilder.addFirstName(scanner.nextLine());
        System.out.print("| Informe o sobrenome: ");
        personBuilder.addLastName(scanner.nextLine());
        System.out.print("| Informe o sexo [M = masculino ou F = Feminino]: ");
        personBuilder.addSix(scanner.next());
        scanner.nextLine();

        System.out.print("| Informe a data de nascimento no formato dd/mm/yyyy (ex: 30/05/1995): ");
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String dateOfBirth = scanner.next();
        scanner.nextLine();
        try {
            personBuilder.addDateOfBirth(dateFormat.parse(dateOfBirth));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.print("| Informe a profissão: ");
        personBuilder.addProfession(scanner.nextLine());
        System.out.print("| Informe o estado civil: ");
        personBuilder.addMaritalStatus(scanner.nextLine());
        return personBuilder.build();
    }

    private Customer menuCompanyCustomer() {
        CompanyCustomerBuilder companyBuilder = new CompanyCustomerBuilder();
        System.out.print("| Informe o CNPJ do cliente: ");
        companyBuilder.addIdentificationDocument(scanner.nextLine());
        System.out.print("| Informe a razão social do cliente: ");
        companyBuilder.addCorporateReason(scanner.nextLine());
        System.out.print("| Informe o nome fantasia: ");
        companyBuilder.addFantasyName(scanner.nextLine());
        return companyBuilder.build(); 
    }

    private AddressBuilder getAdditionalAddressData(AddressBuilder address) {
        System.out.print("| Informe o número do imóvel: ");
        address.addLocationNumber(scanner.next());
        scanner.nextLine();
        System.out.print("| Informe um ponto de referência: ");
        address.addReferencePoint(scanner.nextLine());
        System.out.print("| Informe um complemento: ");
        address.addComplement(scanner.nextLine());
        address.addCountry("Brasil");
    
        return address;
    }

}
