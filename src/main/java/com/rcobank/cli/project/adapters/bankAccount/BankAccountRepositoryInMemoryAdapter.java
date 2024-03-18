/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rcobank.cli.project.adapters.bankAccount;

import com.rcobank.cli.project.domain.bankAccount.BankAccount;
import com.rcobank.cli.project.ports.output.BankAccountRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author dev_rco
 */
public class BankAccountRepositoryInMemoryAdapter implements BankAccountRepository {
    private List<BankAccount> bankAccounts = new ArrayList<>();

    @Override
    public void save(BankAccount bankAccount) {
        System.out.println("Salvando dados....");
        System.out.println(bankAccount);
        this.bankAccounts.add(bankAccount);
    }
    
    @Override
    public List<BankAccount> findAll() {
        return this.bankAccounts;
    }
    
    @Override
    public Optional<BankAccount> findById(Integer bankId) {
        return this.bankAccounts.stream()
                .filter(bankAccount -> bankAccount.getId() == bankId)
                .findFirst();
    }
    
    @Override
    public Optional<BankAccount> findByCustomerId(Integer customerId) {
        return this.bankAccounts.stream()
                .filter(bankAccount -> bankAccount.getCustomer().getId() == customerId)
                .findFirst();
    }
    
}
