/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.rcobank.cli.project.ports.input;

/**
 *
 * @author dev_rco
 */
public interface BankAccountPort {
    void createAnAccount();
    void changeLimit();
    void withdrawMoney();
    void cashDeposit();
    void transferMoney();
    void pix();
    void closeSession();
}
