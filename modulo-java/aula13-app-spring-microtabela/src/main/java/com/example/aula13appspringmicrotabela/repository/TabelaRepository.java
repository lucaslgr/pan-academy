package com.example.aula13appspringmicrotabela.repository;

import com.example.aula13appspringmicrotabela.model.Tabela;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TabelaRepository extends JpaRepository<Tabela, Long> {
}
