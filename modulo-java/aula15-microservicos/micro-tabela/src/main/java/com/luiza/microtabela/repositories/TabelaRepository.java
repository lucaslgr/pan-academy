package com.luiza.microtabela.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luiza.microtabela.model.Tabela;

public interface TabelaRepository extends JpaRepository<Tabela, Long> {

}
