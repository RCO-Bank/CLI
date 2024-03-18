package com.rcobank.cli.project.domain.bankAgency;

import com.rcobank.cli.project.domain.address.Address;
import com.rcobank.cli.project.domain.bank.Bank;

public class BankAgencyBuilder {
    private Integer agencyNumber;
    private String name;
    private Bank bank;
    private Address address;

    public Integer getAgencyNumber() {
        return agencyNumber;
    }

    public BankAgencyBuilder addAgencyNumber(Integer agencyNumber) {
        this.agencyNumber = agencyNumber;
        return this;
    }

    public String getName() {
        return name;
    }

    public BankAgencyBuilder addName(String name) {
        this.name = name;
        return this;
    }

    public Bank getBank() {
        return bank;
    }

    public BankAgencyBuilder addBank(Bank bank) {
        this.bank = bank;
        return this;
    }

    public Address getAddress() {
        return address;
    }

    public BankAgencyBuilder addAddress(Address address) {
        this.address = address;
        return this;
    }

    public BankAgency build() {
        return new BankAgency(this);
    }
}
