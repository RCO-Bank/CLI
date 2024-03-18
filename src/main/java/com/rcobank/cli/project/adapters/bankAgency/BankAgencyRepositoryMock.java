package com.rcobank.cli.project.adapters.bankAgency;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.rcobank.cli.project.domain.address.Address;
import com.rcobank.cli.project.domain.address.AddressBuilder;
import com.rcobank.cli.project.domain.bank.Bank;
import com.rcobank.cli.project.domain.bank.BankBuilder;
import com.rcobank.cli.project.domain.bankAgency.BankAgency;
import com.rcobank.cli.project.domain.bankAgency.BankAgencyBuilder;

public class BankAgencyRepositoryMock {
    // popular dados...
    BankBuilder bankBuilder = new BankBuilder();
    private List<Bank> banks = Arrays.asList(bankBuilder.addFantasyName("Banco Santander")
    .addCorporateReason("Banco Santander ltda")
    .addFiscalIdentification("11223344556610")
    .addId(1)
    .build(),
    bankBuilder.addFantasyName("Banco Santander")
    .addCorporateReason("Banco Santander ltda")
    .addFiscalIdentification("11223344556610")
    .addId(1)
    .build(),
    bankBuilder.addFantasyName("Banco Caixa")
    .addCorporateReason("Banco Caixa ltda")
    .addFiscalIdentification("11223344556611")
    .addId(2)
    .build(),
    bankBuilder.addFantasyName("Banco Itaú")
    .addCorporateReason("Banco Itaú ltda")
    .addFiscalIdentification("11223344556612")
    .addId(3)
    .build()
    );

    BankAgencyBuilder bankAgencyBuilder = new BankAgencyBuilder();
    AddressBuilder addressBuilder = new AddressBuilder();
    private List<Address> addresses = Arrays.asList(
        addressBuilder
        .addCountry("Brasil")
        .addCountry("SP")
        .addCity("Barretos")
        .addPublicPlace("12030530")
        .addNeighborhood("Bairro A")
        .addLocationNumber("1212")
        .addComplement("Casa C")
        .addReferencePoint("Próximo ao shopping")
        .build(),
        addressBuilder
        .addCountry("Brasil")
        .addCountry("PI")
        .addCity("Teresina")
        .addPublicPlace("12030531")
        .addNeighborhood("Bairro T")
        .addLocationNumber("1111")
        .addComplement("Casa A")
        .addReferencePoint("Próximo ao estúdio da BRFilmes")
        .build(),
        addressBuilder
            .addCountry("Brasil")
            .addCountry("TO")
            .addCity("Palmas")
            .addPublicPlace("12030532")
            .addNeighborhood("Bairro B")
            .addLocationNumber("1313")
            .addComplement("Casa B")
            .addReferencePoint("Próximo a MRStore")
            .build()
    );
    private List<BankAgency> bankAgencies = Arrays.asList(
        bankAgencyBuilder
        .addBank(this.banks.get(0))
        .addAddress(addresses.get(0))
        .addAgencyNumber(1)
        .addName("Dom Pedro I")
        .build(),
        bankAgencyBuilder
        .addBank(this.banks.get(1))
        .addAddress(addresses.get(1))
        .addAgencyNumber(2)
        .addName("Lagoa Azul")
        .build(),
        bankAgencyBuilder
        .addBank(this.banks.get(2))
        .addAddress(addresses.get(2))
        .addAgencyNumber(3)
        .addName("Linha Amarela")
        .build()
    );

    public List<BankAgency> getBankAgencies() {
        return bankAgencies;
    }
}
