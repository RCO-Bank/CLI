package com.rcobank.cli.project.adapters.zipCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import com.google.gson.Gson;

import com.rcobank.cli.project.domain.zipCode.AddressViaCep;
import com.rcobank.cli.project.domain.zipCode.ZipCode;
import com.rcobank.cli.project.domain.zipCode.ZipCodeBuilder;
import com.rcobank.cli.project.ports.output.CheckZipCodePort;

public class ZipCodeAdapter implements CheckZipCodePort {
    
    private AddressViaCep getAddress(String cep) throws IOException {
        String url = "https://viacep.com.br/ws/" + cep + "/json/";
        HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
        connection.setRequestMethod("GET");

        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        StringBuilder response = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            response.append(line);
        }
        reader.close();

        Gson gson = new Gson();
        return gson.fromJson(response.toString(), AddressViaCep.class);
    }

    @Override
    public ZipCode consult(String zipCode) throws IOException {
        AddressViaCep address = this.getAddress(zipCode);

        return this.mapAddress(address);
    }

    private ZipCode mapAddress(AddressViaCep addressViaCep) {
        ZipCodeBuilder zipCodeBuilder = new ZipCodeBuilder();

        zipCodeBuilder
        .addCode(addressViaCep.getCep())
        .addFederativeUnit(addressViaCep.getUf())
        .addCity(addressViaCep.getLocalidade())
        .addNeighborhood(addressViaCep.getBairro())
        .addPublicPlace(addressViaCep.getLogradouro());

        return zipCodeBuilder.build();
    }
}
