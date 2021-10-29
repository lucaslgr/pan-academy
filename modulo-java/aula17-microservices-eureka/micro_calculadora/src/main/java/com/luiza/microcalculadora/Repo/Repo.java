package com.luiza.microcalculadora.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luiza.microcalculadora.model.Calculadora;
import com.luiza.microcalculadora.model.Tabela;

public interface Repo extends JpaRepository<Calculadora, Long>{

}
