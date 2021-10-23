package com.panacademy.aula13appspringmicrocalculadora.model;

import javax.persistence.*;

public class Tabela {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String pessoa;
    private Double precoPorDia;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
}