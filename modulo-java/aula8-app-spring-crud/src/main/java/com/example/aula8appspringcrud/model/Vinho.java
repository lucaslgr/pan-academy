package com.example.aula8appspringcrud.model;

import javax.persistence.*;

@Entity
@Table(name = "vinho")
public class Vinho {

    private Long id;

    private String nome;

    private int volume;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
