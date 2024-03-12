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
    
    public AddressBuilder setPublicPlace(String value) {
        this.publicPlace = value;
        return this;
    }
    
    public String getPublicPlace() {
        return this.publicPlace;
    }
    
    public AddressBuilder setNeighborhood(String value) {
        this.neighborhood = value;
        return this;
    }
    
    public String getNeighborhood() {
        return this.neighborhood;
    }
    
    public AddressBuilder setLocationNumber(String value) {
        this.locationNumber = value;
        return this;
    }
    
    public String getLocationNumber() {
        return this.locationNumber;
    }
    
    public AddressBuilder setComplement(String value) {
        this.complement = value;
        return this;
    }
    
    public String getComplement() {
        return this.complement;
    }
    
    public AddressBuilder setReferencePoint(String value) {
        this.referencePoint = value;
        return this;
    }
    
    public String getReferencePoint() {
        return this.referencePoint;
    }
    
    public AddressBuilder setCity(String value) {
        this.city = value;
        return this;
    }
    
    public String getCity() {
        return this.city;
    }
    
    public AddressBuilder setDistrict(String value) {
        this.district = value;
        return this;
    }
    
    public String getDistrict() {
        return this.district;
    }
    
    public AddressBuilder setCountry(String value) {
        this.country = value;
        return this;
    }
    
    public String getCountry() {
        return this.country;
    }
    
    public Address build() {
        return new Address(this);
    }
}
