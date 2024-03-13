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
    protected Integer id;
    protected String identificationDocument;
    protected String phoneNumber;
    protected Address address;    
}
