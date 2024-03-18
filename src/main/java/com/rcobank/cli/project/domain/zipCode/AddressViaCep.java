package com.rcobank.cli.project.domain.zipCode;

public class AddressViaCep {
    private String cep;
    private String uf;
    private String localidade;
    private String bairro;
    private String logradouro;

    public AddressViaCep(String cep, String uf, String localidade, String bairro, String logradouro) {
        this.cep = cep;
        this.uf = uf;
        this.localidade = localidade;
        this.bairro = bairro;
        this.logradouro = logradouro;
    }

    public String getCep() {
        return cep;
    }

    public String getUf() {
        return uf;
    }

    public String getLocalidade() {
        return localidade;
    }

    public String getBairro() {
        return bairro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    @Override
    public String toString() {
        return "AddressViaCep [cep=" + cep + ", uf=" + uf + ", localidade=" + localidade + ", bairro=" + bairro
                + ", logradouro=" + logradouro + "]";
    }

    
}
