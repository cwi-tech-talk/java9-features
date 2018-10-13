package br.com.kimae.api.publicapi;

import br.com.kimae.api.privateapi.PrivateApiExample;

public class MyPublicApi {

    public String getInfoApi() {
        return "Public api info from module: publicapi.example" ;
    }

    public String retrievePrivateInfo() {
        return new PrivateApiExample().getPrivateInfo();
    }

    private String mySecretMethod() {
        return "secrets";
    }
}
