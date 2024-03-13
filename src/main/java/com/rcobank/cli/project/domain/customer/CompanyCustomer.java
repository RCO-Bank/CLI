/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rcobank.cli.project.domain.customer;

/**
 *
 * @author dev_rco
 */
public class CompanyCustomer extends Customer {
    private String corporateReason;
    private String fantasyName;

    public CompanyCustomer(CompanyCustomerBuilder customerBuilder) {
        this.setId(customerBuilder.id);
        this.setIdentificationDocument(customerBuilder.identificationDocument);
        this.setAddress(customerBuilder.address);
        this.setPhoneNumber(customerBuilder.phoneNumber);
        this.corporateReason = customerBuilder.getCorporateReason();
        this.fantasyName = customerBuilder.getFantasyName();
    }
    
    @Override
    public String toString() {
        return "#ID: " + this.getId() + " - " +
               "#IdentificationDocument: " + this.getIdentificationDocument() + " - " +
               "#Address: " + this.getAddress().getCity() + " - " + this.getAddress().getDistrict() + " - " + this.getAddress().getCountry() + " - " +
               "#PhoneNumber: " + this.getPhoneNumber() + " - " +
               "#CorporateReason: " + this.corporateReason + " - " +
               "#FantasyName: " + this.fantasyName;
    }
}
