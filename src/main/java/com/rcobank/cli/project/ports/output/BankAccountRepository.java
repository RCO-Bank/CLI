/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.rcobank.cli.project.ports.output;

import com.rcobank.cli.project.domain.bankAccount.BankAccount;

/**
 *
 * @author dev_rco
 */
public interface BankAccountRepository {
    public void save(BankAccount bankAccount);
}
