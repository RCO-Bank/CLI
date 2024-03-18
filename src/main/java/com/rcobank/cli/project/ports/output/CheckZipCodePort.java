package com.rcobank.cli.project.ports.output;

import java.io.IOException;

import com.rcobank.cli.project.domain.zipCode.ZipCode;

public interface CheckZipCodePort {
    ZipCode consult(String zipCode) throws IOException;
}
