/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.rcobank.cli.project.ports.output;

import com.rcobank.cli.project.domain.bankAccount.BankAccount;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author dev_rco
 */
public interface BankAccountRepository {
    void save(BankAccount bankAccount);
    
    List<BankAccount> findAll();
    
    Optional<BankAccount> findById(Integer bankId);
    
    Optional<BankAccount> findByCustomerId(Integer customerId);
}
