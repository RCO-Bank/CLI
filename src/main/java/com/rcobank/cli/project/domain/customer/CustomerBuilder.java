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
public abstract class CustomerBuilder {
    private Integer id;
    private String identificationDocument;
    private String phoneNumber;
    private Address address;
    private CustomerType kind;
    
    public Integer getId() {
        return id;
    }
    public CustomerBuilder addId(Integer id) {
        this.id = id;
        return this;
    }
    public String getIdentificationDocument() {
        return identificationDocument;
    }
    public CustomerBuilder addIdentificationDocument(String identificationDocument) {
        this.identificationDocument = identificationDocument;
        return this;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public CustomerBuilder addPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public Address getAddress() {
        return address;
    }
    public CustomerBuilder addAddress(Address address) {
        this.address = address;
        return this;
    }
    public CustomerType getKind() {
        return kind;
    }
    public CustomerBuilder setKind(CustomerType kind) {
        this.kind = kind;
        return this;
    }
    
    
}
