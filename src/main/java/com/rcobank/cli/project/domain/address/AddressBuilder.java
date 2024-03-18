/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rcobank.cli.project.domain.address;

/**
 *
 * @author dev_rco
 */
public class AddressBuilder {
    private String publicPlace;
    private String neighborhood;
    private String locationNumber;
    private String complement;
    private String referencePoint;
    private String city;
    private String district;
    private String country;
    private String zipCode;
    
    public AddressBuilder addPublicPlace(String value) {
        this.publicPlace = value;
        return this;
    }
    
    public String getPublicPlace() {
        return this.publicPlace;
    }
    
    public AddressBuilder addNeighborhood(String value) {
        this.neighborhood = value;
        return this;
    }
    
    public String getNeighborhood() {
        return this.neighborhood;
    }
    
    public AddressBuilder addLocationNumber(String value) {
        this.locationNumber = value;
        return this;
    }
    
    public String getLocationNumber() {
        return this.locationNumber;
    }
    
    public AddressBuilder addComplement(String value) {
        this.complement = value;
        return this;
    }
    
    public String getComplement() {
        return this.complement;
    }
    
    public AddressBuilder addReferencePoint(String value) {
        this.referencePoint = value;
        return this;
    }
    
    public String getReferencePoint() {
        return this.referencePoint;
    }
    
    public AddressBuilder addCity(String value) {
        this.city = value;
        return this;
    }
    
    public String getCity() {
        return this.city;
    }
    
    public AddressBuilder addDistrict(String value) {
        this.district = value;
        return this;
    }
    
    public String getDistrict() {
        return this.district;
    }
    
    public AddressBuilder addCountry(String value) {
        this.country = value;
        return this;
    }
    
    public String getCountry() {
        return this.country;
    }

    public AddressBuilder addZipCode(String value) {
        this.zipCode = value;
        return this;
    }
    
    public String getZipCode() {
        return this.zipCode;
    }
    
    public Address build() {
        return new Address(this);
    }
}
