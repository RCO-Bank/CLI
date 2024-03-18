package com.rcobank.cli.project.adapters.zipCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.google.gson.Gson;

import com.rcobank.cli.project.domain.address.Address;
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

    private void exibirEndereco(String enderecoJSON) {
        // Aqui você pode fazer o parsing do JSON e exibir os dados do endereço conforme necessário
        System.out.println("Endereço retornado: ");
        System.out.println(enderecoJSON);
    }

    @Override
    public ZipCode consult(String zipCode) throws IOException {
        AddressViaCep address = this.getAddress(zipCode);

        System.out.println(address);

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
