package com.panacademy.aula19appspringjunit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void testAumentar() {
        System.out.println("somar");
        int n1 = 5;
        int n2 = 5;
        Calculadora calculadoraTeste = new Calculadora();
        double resultadoEsperado = 9.9;
        double result = calculadoraTeste.aumentar(n1, n2);
        assertEquals(resultadoEsperado, result, 0.1);
    }

    @Test
    void testDiminuir() {
        System.out.println("subtrair");
        int n1 = 5;
        int n2 = 3;
        Calculadora calculadoraTeste = new Calculadora();
        double resultadoEsperado = 2;
        double result = calculadoraTeste.diminuir(n1, n2);
        assertEquals(resultadoEsperado, result, 0);
    }

    @Test
    void testMultiplicar() {
        System.out.println("multiplicar");
        int n1 = 5;
        int n2 = 3;
        Calculadora calculadoraTeste = new Calculadora();
        double resultadoEsperado = 15;
        double result = calculadoraTeste.multiplicar(n1, n2);
        assertEquals(resultadoEsperado, result, 0);
    }

    @Test
    void testDividir() {
        System.out.println("multiplicar");
        int n1 = 15;
        int n2 = 3;
        Calculadora calculadoraTeste = new Calculadora();
        double resultadoEsperado = 5;
        double result = calculadoraTeste.dividir(n1, n2);
        assertEquals(resultadoEsperado, result, 0);
    }
    @Test
    void testPower2() {
        System.out.println("Potência");
        double n1 = 6;
        Calculadora calculadoraTeste = new Calculadora();
        double resultadoEsperado = 36;
        double result = calculadoraTeste.power2(n1);
        assertEquals(resultadoEsperado, result, 0);
    }
}