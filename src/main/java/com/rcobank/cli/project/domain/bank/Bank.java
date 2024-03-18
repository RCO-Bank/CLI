/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rcobank.cli.project.domain.bank;

/**
 *
 * @author dev_rco
 */
public class Bank {
    private Integer id;
    private String corporateReason;
    private String fantasyName;
    private String fiscalIdentification;
    
    public Bank(BankBuilder bankBuilder) {
        this.id = bankBuilder.getId();
        this.corporateReason = bankBuilder.getCorporateReason();
        this.fantasyName = bankBuilder.getFantasyName();
        this.fiscalIdentification = bankBuilder.getFantasyName();
    }

    // getters and setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCorporateReason() {
        return corporateReason;
    }

    public void setCorporateReason(String corporateReason) {
        this.corporateReason = corporateReason;
    }

    public String getFantasyName() {
        return fantasyName;
    }

    public void setFantasyName(String fantasyName) {
        this.fantasyName = fantasyName;
    }

    public String getFiscalIdentification() {
        return fiscalIdentification;
    }

    public void setFiscalIdentification(String fiscalIdentification) {
        this.fiscalIdentification = fiscalIdentification;
    }
}
