/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.rcobank.cli.project.domain.bankAccount;

import com.rcobank.cli.project.domain.customer.Customer;

/**
 *
 * @author dev_rco
 */
public class CreateAnAccountDTO {
    private Number agencyNumber;
    private Double balance;
    private Double creditLimit;
    private AccountType accountType;
    private Customer customer;

    public Number getAgencyNumber() {
        return agencyNumber;
    }

    public void setAgencyNumber(Number agencyNumber) {
        this.agencyNumber = agencyNumber;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(Double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public CreateAnAccountDTO(Number agencyNumber, Double balance, Double creditLimit, AccountType accountType, Customer customer) {
        this.agencyNumber = agencyNumber;
        this.balance = balance;
        this.creditLimit = creditLimit;
        this.accountType = accountType;
        this.customer = customer;
    }
}
