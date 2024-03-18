/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rcobank.cli.project.domain.address;

/**
 *
 * @author dev_rco
 */
public class Address {
    private String publicPlace;
    private String neighborhood;
    private String locationNumber;
    private String complement;
    private String referencePoint;
    private String city;
    private String district;
    private String country;
    private String zipCode;
    
    public Address(AddressBuilder addressBuilder) {
        this.publicPlace = addressBuilder.getPublicPlace();
        this.neighborhood = addressBuilder.getNeighborhood();
        this.city = addressBuilder.getCity();
        this.complement = addressBuilder.getComplement();
        this.country = addressBuilder.getCountry();
        this.district = addressBuilder.getDistrict();
        this.referencePoint = addressBuilder.getReferencePoint();
        this.locationNumber = addressBuilder.getLocationNumber();
        this.zipCode = addressBuilder.getZipCode();
    }

    public String getPublicPlace() {
        return publicPlace;
    }

    public void setPublicPlace(String publicPlace) {
        this.publicPlace = publicPlace;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getLocationNumber() {
        return locationNumber;
    }

    public void setLocationNumber(String locationNumber) {
        this.locationNumber = locationNumber;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getReferencePoint() {
        return referencePoint;
    }

    public void setReferencePoint(String referencePoint) {
        this.referencePoint = referencePoint;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    
}
