package br.com.kimae.api.notprivateapi;

public class PrivateAccessiblePublicApi {

    private String notTooPrivateMathod() {
        return "Not so private message from module publicapi.example and class: " + this.getClass();
    }
}
