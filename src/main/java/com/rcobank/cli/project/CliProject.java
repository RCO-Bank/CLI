/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.rcobank.cli.project;

import com.rcobank.cli.project.UI.MenuCLI;
import com.rcobank.cli.project.config.DependencyFactory;
import com.rcobank.cli.project.controllers.BankAccountController;
import com.rcobank.cli.project.ports.input.BankAccountUseCase;
import com.rcobank.cli.project.ports.output.CheckZipCodeUseCase;

/**
 *
 * @author dev_rco
 */
public class CliProject {

    public static void main(String[] args) {
        BankAccountUseCase bankAccountUseCase = DependencyFactory.getBankAccountService();
        CheckZipCodeUseCase checkZipCodeUseCase = DependencyFactory.getZipCodeService();
        BankAccountController bankAccountController = new BankAccountController(bankAccountUseCase);
        
        MenuCLI menu = new MenuCLI(bankAccountController, checkZipCodeUseCase);
        
        menu.display();
    }
}
