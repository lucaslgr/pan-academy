package com.panacademy;

public class TestPatternMatching {
    public static void run() {
        System.out.println("Testando Pattern Matching do Java 14");

        String obj = "Lucas";
        if (obj instanceof String nome) {
            System.out.println(obj + " É um objeto instancia de String, resultado da atribuição: "+ nome);
        }
    }
}
