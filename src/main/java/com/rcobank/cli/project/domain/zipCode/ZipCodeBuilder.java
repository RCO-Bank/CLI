package com.rcobank.cli.project.domain.zipCode;

public class ZipCodeBuilder {
    private String federativeUnit;
    private String city;
    private String code;
    private String neighborhood;
    private String publicPlace;

    public String getFederativeUnit() {
        return federativeUnit;
    }
    public ZipCodeBuilder addFederativeUnit(String federativeUnit) {
        this.federativeUnit = federativeUnit;
        return this;
    }
    public String getCity() {
        return city;
    }
    public ZipCodeBuilder addCity(String city) {
        this.city = city;
        return this;
    }
    public String getCode() {
        return code;
    }
    public ZipCodeBuilder addCode(String code) {
        this.code = code;
        return this;
    }
    public String getNeighborhood() {
        return neighborhood;
    }
    public ZipCodeBuilder addNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
        return this;
    }
    public String getPublicPlace() {
        return publicPlace;
    }
    public ZipCodeBuilder addPublicPlace(String publicPlace) {
        this.publicPlace = publicPlace;
        return this;
    }

    public ZipCode build() {
        return new ZipCode(this);
    }
}
