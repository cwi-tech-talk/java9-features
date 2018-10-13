package br.com.kimae.moduleexample.service;

import br.com.kimae.api.publicapi.PublicApiService;

public class FallbackPublicApiServiceImpl implements PublicApiService {
    @Override
    public void execute() {
        System.out.println("Default impl select because no other impls were found.");
    }
}
