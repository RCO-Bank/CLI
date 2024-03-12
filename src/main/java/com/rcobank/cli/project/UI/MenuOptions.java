/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.rcobank.cli.project.UI;

/**
 *
 * @author dev_rco
 */
public enum MenuOptions {
    CREATE_AN_ACCOUNT(1),
    ACCESS_ACCOUNT(2),
    CHANGE_LIMIT(3),
    TO_WITHDRAW(4),
    TRANSFER(5),
    DEPOSIT(6),
    PIX(7),
    CHECK_BALANCE(8),
    EXIT(9),
    FINISH(10);
    private final int option;

    private MenuOptions(int value) {
        this.option = value;
    }
}
