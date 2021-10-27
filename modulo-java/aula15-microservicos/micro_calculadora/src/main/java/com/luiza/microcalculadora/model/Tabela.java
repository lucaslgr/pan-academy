package com.luiza.microcalculadora.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Tabela {
	@Id
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
