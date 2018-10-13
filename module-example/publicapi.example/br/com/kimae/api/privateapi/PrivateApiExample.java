package br.com.kimae.api.privateapi;

public class PrivateApiExample {

    public String getPrivateInfo() {
        return "Private Info :( from module publicapi.example and class: " + this.getClass();
    }
}
