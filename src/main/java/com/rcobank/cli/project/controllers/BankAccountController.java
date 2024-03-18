/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rcobank.cli.project.controllers;

import com.rcobank.cli.project.domain.bankAccount.CreateAnAccountDTO;
import com.rcobank.cli.project.ports.input.BankAccountUseCase;

/**
 *
 * @author dev_rco
 */
public class BankAccountController {

    private BankAccountUseCase bankAccountUseCase;
    
    public BankAccountController(BankAccountUseCase bankAccountService) {
        this.bankAccountUseCase = bankAccountService;
    }
  
    public void createAnAccount(CreateAnAccountDTO createAnAccount) {
        System.out.println("Controller do menu invocando caso de uso...");
        this.bankAccountUseCase.createAnAccount(createAnAccount);
    }

    public void changeLimit() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void withdrawMoney() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void cashDeposit() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void transferMoney() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void pix() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void closeSession() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
