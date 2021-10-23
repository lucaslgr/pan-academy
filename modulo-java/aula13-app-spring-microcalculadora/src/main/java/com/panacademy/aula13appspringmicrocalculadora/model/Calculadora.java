package com.panacademy.aula13appspringmicrocalculadora.model;

public class Calculadora {
    private String pessoa;
    private Double precoPorDia;
    private Integer dias;

    public Calculadora(String pessoa, Double precoPorDia, Integer dias) {
        super();
        this.pessoa = pessoa;
        this.precoPorDia = precoPorDia;
        this.dias = dias;
    }

    public double getTotal() {
        return dias * precoPorDia;
    }

    public String getPessoa() {
        return pessoa;
    }

    public void setPessoa(String pessoa) {
        this.pessoa = pessoa;
    }

    public Double getPrecoPorDia() {
        return precoPorDia;
    }

    public void setPrecoPorDia(Double precoPorDia) {
        this.precoPorDia = precoPorDia;
    }

    public Integer getDias() {
        return dias;
    }

    public void setDias(Integer dias) {
        this.dias = dias;
    }
}

