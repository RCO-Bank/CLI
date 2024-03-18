package com.rcobank.cli.project.domain.customer;

public enum CustomerType {
    PF(1),
    PJ(2);

    private final int option;

    private CustomerType(int value) {
        this.option = value;
    }
}
