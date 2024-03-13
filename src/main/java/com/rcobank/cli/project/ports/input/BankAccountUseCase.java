/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.rcobank.cli.project.ports.input;

import com.rcobank.cli.project.domain.bankAccount.BankAccount;
import com.rcobank.cli.project.domain.bankAccount.CreateAnAccountDTO;

/**
 *
 * @author dev_rco
 */
public interface BankAccountUseCase {
    void createAnAccount(CreateAnAccountDTO createAnAccount);
    void changeLimit();
    void withdrawMoney();
    void cashDeposit();
    void transferMoney();
    void pix();
    void closeSession();
}
