package com.panacademy.aula19springappcrudaws.repository;

import com.panacademy.aula19springappcrudaws.model.Topico;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TopicoRepository extends JpaRepository<Topico, Long> {
    List<Topico> findAllByTopicoContainingIgnoreCase(String nome);
}
