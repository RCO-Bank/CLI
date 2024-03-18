package com.rcobank.cli.project.ports.output;

import java.util.List;
import java.util.Optional;

import com.rcobank.cli.project.domain.bankAgency.BankAgency;

public interface BankAgencyRepository {
    List<BankAgency> findAll();
    Optional<BankAgency> findById(Integer bankAgencyId);
}
