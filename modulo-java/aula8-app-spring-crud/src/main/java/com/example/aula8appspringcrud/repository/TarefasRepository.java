package com.example.aula8appspringcrud.repository;

import com.example.aula8appspringcrud.model.TarefasModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TarefasRepository extends JpaRepository<TarefasModel, Long> {
    public List<TarefasModel> findAllByTarefaContainingIgnoreCase(String tarefa);
}
