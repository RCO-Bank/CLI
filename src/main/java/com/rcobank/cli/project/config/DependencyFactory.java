/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rcobank.cli.project.config;

import com.rcobank.cli.project.ports.input.BankAccountUseCase;
import com.rcobank.cli.project.ports.output.BankAccountRepository;
import com.rcobank.cli.project.ports.output.CheckZipCodePort;
import com.rcobank.cli.project.ports.output.CheckZipCodeUseCase;
import com.rcobank.cli.project.services.BankAccountService;
import com.rcobank.cli.project.services.ZipCodeService;
import com.rcobank.cli.project.adapters.bankAccount.BankAccountRepositoryInMemoryAdapter;
import com.rcobank.cli.project.adapters.zipCode.ZipCodeAdapter;

/**
 *
 * @author dev_rco
 */

public class DependencyFactory {
    private static final BankAccountRepository bankAccountRepository = new BankAccountRepositoryInMemoryAdapter();
    private static final CheckZipCodePort checkZipCodePort = new ZipCodeAdapter();

    private static final BankAccountUseCase bankAccountUseCase = new BankAccountService(bankAccountRepository);
    private static final CheckZipCodeUseCase checkZipCodeUseCase = new ZipCodeService(checkZipCodePort);

    public static BankAccountUseCase getBankAccountService() {
        return bankAccountUseCase;
    }

    public static CheckZipCodeUseCase getZipCodeService() {
        return checkZipCodeUseCase;
    }
}

