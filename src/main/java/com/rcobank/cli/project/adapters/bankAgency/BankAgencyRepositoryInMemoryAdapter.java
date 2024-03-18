package com.rcobank.cli.project.adapters.bankAgency;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.rcobank.cli.project.domain.bankAgency.BankAgency;
import com.rcobank.cli.project.ports.output.BankAgencyRepository;

public class BankAgencyRepositoryInMemoryAdapter implements BankAgencyRepository{

    private List<BankAgency> bankAgencies = new ArrayList<>();

    public BankAgencyRepositoryInMemoryAdapter() {
        BankAgencyRepositoryMock bankAgencyRepositoryMock = new BankAgencyRepositoryMock();
        this.bankAgencies = bankAgencyRepositoryMock.getBankAgencies();
    }

    @Override
    public List<BankAgency> findAll() {
        return this.bankAgencies;
    }

    @Override
    public Optional<BankAgency> findById(Integer bankAgencyId) {
        return this.bankAgencies.stream()
        .filter(bankAgency -> bankAgency.getAgencyNumber() == bankAgencyId)
        .findFirst();
    }

}
