package com.rcobank.cli.project.ports.output;

import java.util.List;
import java.util.Optional;

import com.rcobank.cli.project.domain.bank.Bank;

public interface BankRepository {
    List<Bank> findAll();
    Optional<Bank> findById(Integer bankId);
}
