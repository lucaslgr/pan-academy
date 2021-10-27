package com.luiza.microcalculadora.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Calculadora{
	
	@Id
	private String pessoa;
	private Double precoPorDia;
	private Integer dias;
	private Double getTotal;
	

	public Calculadora(String pessoa, Double precoPorDia, Integer dias) {
		super();
		this.pessoa = pessoa;
		this.precoPorDia = precoPorDia;
		this.dias = dias;
	}
	

	public Calculadora(String pessoa) {
		super();
		this.pessoa = pessoa;
	
	}

	//GETTERS E SETTERS 
	
	//ESCONDI MAS VC TEM QUE POR
	public double getTotal() {
		return dias * precoPorDia;
	}
	
	
	public double setTotal() {
		return dias * precoPorDia;
	}
	
	
	
	
	public String getpessoa() {
		return pessoa;
	}

	public void setpessoa(String pessoa) {
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
