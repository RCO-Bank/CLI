package com.rcobank.cli.project.domain.customer;

import java.util.Date;

public class CustomerPerson extends Customer {
    private String firstName;
    private String lastName;
    private String six;
    private Date dateOfBirth;
    private String profession;
    private String maritalStatus;

    public CustomerPerson(CustomerPersonBuilder customerBuilder) {
        this.setId(customerBuilder.getId());
        this.setIdentificationDocument(customerBuilder.getIdentificationDocument());
        this.setAddress(customerBuilder.getAddress());
        this.setPhoneNumber(customerBuilder.getPhoneNumber());

        this.setFirstName(customerBuilder.getFirstName());
        this.setLastName(customerBuilder.getLastName());
        this.setSix(customerBuilder.getSix());
        this.setDateOfBirth(customerBuilder.getDateOfBirth());
        this.setProfession(customerBuilder.getProfession());
        this.setMaritalStatus(customerBuilder.getMaritalStatus());
    }

    public String getSix() {
        return six;
    }
    public void setSix(String six) {
        this.six = six;
    }
    public Date getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public String getProfession() {
        return profession;
    }
    public void setProfession(String profession) {
        this.profession = profession;
    }
    public String getMaritalStatus() {
        return maritalStatus;
    }
    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "CustomerPerson [firstName=" + firstName + ", lastName=" + lastName + ", six=" + six + ", dateOfBirth="
                + dateOfBirth + ", profession=" + profession + ", maritalStatus=" + maritalStatus + "]";
    }
    
}
