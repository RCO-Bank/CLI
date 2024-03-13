/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rcobank.cli.project.domain.bankAccount;

import com.rcobank.cli.project.domain.customer.Customer;

/**
 *
 * @author dev_rco
 */
public class BankAccountBuilder {
    private Number id;
    private Number agencyNumber;
    private Double balance;
    private Double creditLimit;
    private AccountType accountType;
    private Customer customer;
    
    public BankAccountBuilder setId(Number value) {
        this.id = value;
        return this;
    }

    public Number getId() {
        return id;
    }
    
    public BankAccountBuilder setAgencyNumber(Number value) {
        this.agencyNumber = value;
        return this;
    }

    public Number getAgencyNumber() {
        return agencyNumber;
    }
    
    public BankAccountBuilder setBalance(Double value) {
        this.balance = value;
        return this;
    }

    public Double getBalance() {
        return balance;
    }
    
    public BankAccountBuilder setCreditLimit(Double value) {
        this.creditLimit = value;
        return this;
    }

    public Double getCreditLimit() {
        return creditLimit;
    }
    
    public BankAccountBuilder setAccountType(AccountType value) {
        this.accountType = value;
        return this;
    }

    public AccountType getAccountType() {
        return accountType;
    }
    
    public BankAccountBuilder setCustomer(Customer value) {
        this.customer = value;
        return this;
    }

    public Customer getCustomer() {
        return customer;
    }
    
    public BankAccount build() {
        return new BankAccount(this);
    }
    
    
}
