package com.example.aula13appspringmicrotabela.model;

import javax.persistence.*;

@Entity
//renomear o nome da tabela
@Table(name = "tb_tabelinha")
public class Tabela {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String pessoa;
    @Column(name = "preco")
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
