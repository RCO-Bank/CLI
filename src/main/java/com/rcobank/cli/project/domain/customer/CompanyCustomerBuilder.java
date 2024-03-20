/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rcobank.cli.project.domain.customer;

import com.rcobank.cli.project.domain.address.Address;

/**
 *
 * @author dev_rco
 */
public class CompanyCustomerBuilder extends CustomerBuilder {
    private String corporateReason;
    private String fantasyName;

    public String getCorporateReason() {
        return corporateReason;
    }

    public String getFantasyName() {
        return fantasyName;
    }
    
    public CompanyCustomerBuilder addCorporateReason(String value) {
        this.corporateReason = value;
        return this;
    }
    
    public CompanyCustomerBuilder addFantasyName(String value) {
        this.fantasyName = value;
        return this;
    }
    
    public CompanyCustomer build() {
        return new CompanyCustomer(this);
    }
    
}
