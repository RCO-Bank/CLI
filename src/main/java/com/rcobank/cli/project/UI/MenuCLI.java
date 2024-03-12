/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rcobank.cli.project.UI;

import com.rcobank.cli.project.adapters.controllers.BankAccountController;
import com.rcobank.cli.project.ports.input.MenuPort;
import java.util.Scanner;

/**
 *
 * @author dev_rco
 */
public class MenuCLI implements MenuPort {
    private final Scanner scanner = new Scanner(System.in);
    private final BankAccountController terminalMenuController = new BankAccountController();
    
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
        switch (option) {
            case CREATE_AN_ACCOUNT:
                this.registerAnAccount();
                break;
            case EXIT:
                System.out.println("Finalizando sessão...");
                break;
            default:
                System.out.println("Selecione uma opção válida...");;
        }
    }
    
    private void registerAnAccount() {
        System.out.println("-> Iniciar cadastro de conta bancária -<");
        this.terminalMenuController.createAnAccount();
    }

}
