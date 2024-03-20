package com.rcobank.cli.project.domain.customer;

import java.util.Date;

public class CustomerPersonBuilder extends CustomerBuilder {

    private String firstName;
    private String lastName;
    private String six;
    private Date dateOfBirth;
    private String profession;
    private String maritalStatus;

    public String getSix() {
        return six;
    }
    public CustomerPersonBuilder addSix(String six) {
        this.six = six;
        return this;
    }
    public Date getDateOfBirth() {
        return dateOfBirth;
    }
    public CustomerPersonBuilder addDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }
    public String getProfession() {
        return profession;
    }
    public CustomerPersonBuilder addProfession(String profession) {
        this.profession = profession;
        return this;
    }
    public String getMaritalStatus() {
        return maritalStatus;
    }
    public CustomerPersonBuilder addMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
        return this;
    }

    public CustomerPerson build() {
        return new CustomerPerson(this);
    }
    public String getFirstName() {
        return firstName;
    }
    public CustomerPersonBuilder addFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }
    public String getLastName() {
        return lastName;
    }
    public CustomerPersonBuilder addLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    
    
}
