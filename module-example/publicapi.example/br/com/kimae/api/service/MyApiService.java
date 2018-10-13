package br.com.kimae.api.service;

import br.com.kimae.api.publicapi.PublicApiService;

public class MyApiService implements PublicApiService {
    @Override
    public void execute() {
        System.out.println("My Service Impl. Module: publicapi.example " + this.getClass());
    }
}
