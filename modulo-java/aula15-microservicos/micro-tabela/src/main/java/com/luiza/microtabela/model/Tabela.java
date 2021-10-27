package com.luiza.microtabela.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
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
