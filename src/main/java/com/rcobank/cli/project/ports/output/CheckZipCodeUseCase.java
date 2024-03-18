package com.rcobank.cli.project.ports.output;

import java.io.IOException;

import com.rcobank.cli.project.domain.zipCode.ZipCode;

public interface CheckZipCodeUseCase {
    ZipCode verify(String zipCode) throws IOException;
}
