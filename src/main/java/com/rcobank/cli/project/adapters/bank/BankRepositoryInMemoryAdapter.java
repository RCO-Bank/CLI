package com.rcobank.cli.project.adapters.bank;

import java.util.List;
import java.util.Optional;

import com.rcobank.cli.project.domain.bank.Bank;
import com.rcobank.cli.project.domain.bank.BankBuilder;
import com.rcobank.cli.project.ports.output.BankRepository;

public class BankRepositoryInMemoryAdapter implements BankRepository{

    private List<Bank> banks;

    public BankRepositoryInMemoryAdapter() {
        BankBuilder bankBuilder = new BankBuilder();
    
        this.banks.add(bankBuilder.addFantasyName("Bank A")
        .addCorporateReason("Bank A ltda")
        .addFiscalIdentification("11223344556677")
        .addId(1)
        .build());

        this.banks.add(bankBuilder.addFantasyName("Bank B")
        .addCorporateReason("Bank B ltda")
        .addFiscalIdentification("11223344556678")
        .addId(1)
        .build());

        this.banks.add(bankBuilder.addFantasyName("Bank C")
        .addCorporateReason("Bank C ltda")
        .addFiscalIdentification("11223344556679")
        .addId(1)
        .build());

        this.banks.add(bankBuilder.addFantasyName("Bank D")
        .addCorporateReason("Bank D ltda")
        .addFiscalIdentification("11223344556610")
        .addId(1)
        .build());
    }

    @Override
    public List<Bank> findAll() {
        return this.banks;
    }

    @Override
    public Optional<Bank> findById(Integer bankId) {
        return this.banks.stream()
                .filter(bank -> bank.getId() == bankId)
                .findFirst();
    }

}
