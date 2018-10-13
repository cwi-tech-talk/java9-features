package br.com.kimae.moduleexample;

import br.com.kimae.api.publicapi.MyPublicApi;
import br.com.kimae.api.publicapi.PublicApiService;

import java.util.ServiceLoader;

public class ModuleExample {
    public static void main(String[] args){

        final MyPublicApi publicApi = new MyPublicApi();

        ServiceLoader.load(PublicApiService.class).findFirst()
                .get()
                .execute();

        System.out.println(publicApi.getInfoApi());

        System.out.println(publicApi.retrievePrivateInfo());


    }
}
