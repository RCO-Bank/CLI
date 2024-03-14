/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rcobank.cli.project.config;

import com.rcobank.cli.project.adapters.bankAccount.BankAccountRepositoryInMemoryAdapter;
import com.rcobank.cli.project.ports.input.BankAccountUseCase;
import com.rcobank.cli.project.ports.output.BankAccountRepository;
import com.rcobank.cli.project.services.BankAccountService;

/**
 *
 * @author dev_rco
 */
public class ApplicationConfig {
    private static BankAccountRepository bankAccountRepository; 
    private static BankAccountUseCase bankAccountUseCase; 
    
    public static void initialize() {
        bankAccountRepository = BankAccountRepositoryInMemoryAdapter.getInstance();
        bankAccountUseCase = BankAccountService.getInstance(bankAccountRepository);
    }
 
}
