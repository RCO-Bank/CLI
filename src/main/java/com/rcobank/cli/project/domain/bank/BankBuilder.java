/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rcobank.cli.project.domain.bank;

/**
 *
 * @author dev_rco
 */
public class BankBuilder {
    private Integer id;
    private String corporateReason;
    private String fantasyName;
    private String fiscalIdentification;

    public BankBuilder addId(Integer id) {
        this.id = id;
        return this;
    }

    public BankBuilder addCorporateReason(String corporateReason) {
        this.corporateReason = corporateReason;
        return this;
    }

    public BankBuilder addFantasyName(String fantasyName) {
        this.fantasyName = fantasyName;
        return this;
    }

    public BankBuilder addFiscalIdentification(String fiscalIdentification) {
        this.fiscalIdentification = fiscalIdentification;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public String getCorporateReason() {
        return corporateReason;
    }

    public String getFantasyName() {
        return fantasyName;
    }

    public String getFiscalIdentification() {
        return fiscalIdentification;
    }
    
    public Bank build() {
        return new Bank(this);
    }
    
    
}
