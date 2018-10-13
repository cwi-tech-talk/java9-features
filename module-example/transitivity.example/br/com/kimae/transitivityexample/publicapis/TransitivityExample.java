package br.com.kimae.transitivityexample.publicapis;

public class TransitivityExample {

    public String transitiveMethod() {
        return "Transistive method from module transitivity.example, class: " + this.getClass();
    }
}
