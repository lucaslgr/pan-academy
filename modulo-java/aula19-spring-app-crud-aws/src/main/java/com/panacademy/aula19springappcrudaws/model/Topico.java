package com.panacademy.aula19springappcrudaws.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_topico")
public class Topico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String topico_descricao;

    @OneToMany(mappedBy = "topico", cascade = CascadeType.ALL)
    @JsonIgnoreProperties("topico")
    private List<Texto> topico;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getTopico_descricao() {
        return topico_descricao;
    }

    public void setTopico_descricao(String topico_descricao) {
        this.topico_descricao = topico_descricao;
    }

    public List<Texto> getTopico() {
        return topico;
    }

    public void setTopico(List<Texto> topico) {
        this.topico = topico;
    }
}
