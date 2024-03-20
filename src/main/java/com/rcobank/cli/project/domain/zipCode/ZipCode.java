package com.rcobank.cli.project.domain.zipCode;

public class ZipCode {
    private String federativeUnit;
    private String city;
    private String code;
    private String neighborhood;
    private String publicPlace;
    
    public ZipCode(ZipCodeBuilder zipCodeBuilder) {
        this.federativeUnit = zipCodeBuilder.getFederativeUnit();
        this.city = zipCodeBuilder.getCity();
        this.code = zipCodeBuilder.getCode();
        this.neighborhood = zipCodeBuilder.getNeighborhood();
        this.publicPlace = zipCodeBuilder.getPublicPlace();
    }
    
    public String getFederativeUnit() {
        return federativeUnit;
    }
    public void setFederativeUnit(String federativeUnit) {
        this.federativeUnit = federativeUnit;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getNeighborhood() {
        return neighborhood;
    }
    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getPublicPlace() {
        return publicPlace;
    }

    public void setPublicPlace(String publicPlace) {
        this.publicPlace = publicPlace;
    }

    @Override
    public String toString() {
        return "Endereço [UF=" + federativeUnit + ", cidade=" + city + ", cep=" + code + ", bairro="
                + neighborhood + ", logradouro=" + publicPlace + "]";
    }
    
}
