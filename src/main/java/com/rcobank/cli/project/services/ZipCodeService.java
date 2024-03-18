package com.rcobank.cli.project.services;

import java.io.IOException;
import java.util.logging.Logger;

import com.rcobank.cli.project.domain.zipCode.ZipCode;
import com.rcobank.cli.project.ports.output.CheckZipCodePort;
import com.rcobank.cli.project.ports.output.CheckZipCodeUseCase;

public class ZipCodeService implements CheckZipCodeUseCase {
    private CheckZipCodePort checkZipCodePort;
    private static final Logger logger = Logger.getLogger(ZipCodeService.class.getName());


    public ZipCodeService(CheckZipCodePort checkZipCodePort) {
        this.checkZipCodePort = checkZipCodePort;
    }

    @Override
    public ZipCode verify(String zipCode) {
        try {
            return this.checkZipCodePort.consult(zipCode);
        } catch (IOException e) {
            this.logger.warning(String.format("Erro ao consultar cep %s: %s", zipCode, e.getMessage()));
            throw new RuntimeException("Erro ao obter endereço a partir do CEP", e);
        }
    }

}
