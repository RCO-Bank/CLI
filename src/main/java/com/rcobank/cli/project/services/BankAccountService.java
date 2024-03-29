/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rcobank.cli.project.services;

import com.rcobank.cli.project.domain.bankAccount.BankAccount;
import com.rcobank.cli.project.domain.bankAccount.BankAccountBuilder;
import com.rcobank.cli.project.domain.bankAccount.CreateAnAccountDTO;
import com.rcobank.cli.project.ports.input.BankAccountUseCase;
import com.rcobank.cli.project.ports.output.BankAccountRepository;
import java.util.List;

/**
 *
 * @author dev_rco
 */
public final class BankAccountService implements BankAccountUseCase {
    private BankAccountRepository bankAccountRepository;
 
    public BankAccountService(BankAccountRepository bankAccountRepository) {
        this.bankAccountRepository = bankAccountRepository;
    }
    
    @Override
    public void createAnAccount(CreateAnAccountDTO createAnAccount) {
        System.out.println("Service invocando adapter...");
        BankAccountBuilder bankAccountBuilder = new BankAccountBuilder();

        // gerar id
        List<BankAccount> bankAccounts = this.bankAccountRepository.findAll();
        BankAccount bankAccount = bankAccountBuilder
                .setAccountType(createAnAccount.getAccountType())
                .setAgencyNumber(createAnAccount.getAgencyNumber())
                .setCustomer(createAnAccount.getCustomer())
                .setId(bankAccounts.size()+1)
                .build();
        this.bankAccountRepository.save(bankAccount);
    }

    @Override
    public void changeLimit() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void withdrawMoney() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void cashDeposit() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void transferMoney() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void pix() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void closeSession() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
