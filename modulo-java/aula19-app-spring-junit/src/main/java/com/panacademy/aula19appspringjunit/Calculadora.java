package com.panacademy.aula19appspringjunit;

public class Calculadora {

    private int resultado = 0;
    public double aumentar(int n1, int n2) {
        return n1 + n2;
    }

    public double diminuir(int n1, int n2) {
        return n1 - n2;
    }

    public double multiplicar(int n1, int n2) {
        return n1 * n2;
    }

    public double dividir(int n1, int n2) {
        return n1 / n2;
    }
    
    public double power2(double n1) {
        return n1*n1;
    }
}
