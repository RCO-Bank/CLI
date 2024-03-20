/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rcobank.cli.project.domain.bankAccount;

import com.rcobank.cli.project.domain.customer.Customer;
import com.rcobank.cli.project.domain.customer.CustomerType;

/**
 *
 * @author dev_rco
 */
public class BankAccount {
    private Number id;
    private Number agencyNumber;
    private Double balance;
    private Double creditLimit;
    private AccountType accountType;
    private Customer customer;
    
    public BankAccount(BankAccountBuilder bankAccountBuilder) {
        this.id = bankAccountBuilder.getId();
        this.accountType = bankAccountBuilder.getAccountType();
        this.agencyNumber = bankAccountBuilder.getAgencyNumber();
        this.balance = 0.0;
        this.customer = bankAccountBuilder.getCustomer();
        this.creditLimit = this.customer.getKind() == CustomerType.PF ? 150.0 : 1000;
    }

    public Number getId() {
        return id;
    }

    public Number getAgencyNumber() {
        return agencyNumber;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getCreditLimit() {
        return creditLimit;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public Customer getCustomer() {
        return customer;
    }

    @Override
    public String toString() {
        return "BankAccount{" + "id=" + id + ", agencyNumber=" + agencyNumber + ", balance=" + balance + ", creditLimit=" + creditLimit + ", accountType=" + accountType + ", customer=" + customer + '}';
    }
    
}
