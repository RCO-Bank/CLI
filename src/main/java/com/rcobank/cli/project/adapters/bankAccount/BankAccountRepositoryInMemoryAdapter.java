/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rcobank.cli.project.adapters.bankAccount;

import com.rcobank.cli.project.domain.bankAccount.BankAccount;
import com.rcobank.cli.project.ports.output.BankAccountRepository;

/**
 *
 * @author dev_rco
 */
public class BankAccountRepositoryInMemoryAdapter implements BankAccountRepository {

    @Override
    public void save(BankAccount bankAccount) {
        System.out.println("Salvando dados....");
    }
    
}
