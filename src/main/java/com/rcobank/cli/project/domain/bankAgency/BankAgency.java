package com.rcobank.cli.project.domain.bankAgency;

import com.rcobank.cli.project.domain.address.Address;
import com.rcobank.cli.project.domain.bank.Bank;

public class BankAgency {
    private Integer agencyNumber;
    private String name;
    private Bank bank;
    private Address address;

    public BankAgency(BankAgencyBuilder bankAgencyBuilder) {
        this.agencyNumber = bankAgencyBuilder.getAgencyNumber();
        this.address = bankAgencyBuilder.getAddress();
        this.bank = bankAgencyBuilder.getBank();
        this.name = bankAgencyBuilder.getName();
    }

    public Integer getAgencyNumber() {
        return agencyNumber;
    }

    public void setAgencyNumber(Integer agencyNumber) {
        this.agencyNumber = agencyNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
