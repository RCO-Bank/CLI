/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rcobank.cli.project.services;

import com.rcobank.cli.project.domain.bankAccount.AccountType;
import com.rcobank.cli.project.domain.bankAccount.BankAccount;
import com.rcobank.cli.project.domain.bankAccount.BankAccountBuilder;
import com.rcobank.cli.project.domain.bankAccount.CreateAnAccountDTO;
import com.rcobank.cli.project.ports.input.BankAccountUseCase;
import com.rcobank.cli.project.ports.output.BankAccountRepository;

/**
 *
 * @author dev_rco
 */
public final class AccountService implements BankAccountUseCase {
    private static AccountService instance;
    private BankAccountRepository bankAccountRepository;
    
    public static AccountService getInstance(BankAccountRepository bankAccountRepository) {
        if (instance == null) {
            instance = new AccountService(bankAccountRepository);
        }
        return instance;
    }
 
    private AccountService(BankAccountRepository bankAccountRepository) {
        this.bankAccountRepository = bankAccountRepository;
    }
    
    @Override
    public void createAnAccount(CreateAnAccountDTO createAnAccount) {
        System.out.println("Service invocando adapter...");
        BankAccount bankAccount = new BankAccountBuilder()
                .setAccountType(AccountType.SALARY_ACCOUNT)
                .setAgencyNumber(10)
                .setBalance(250.0)
                .setCreditLimit(1500.50)
                .setId(300)
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
