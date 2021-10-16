package com.datas.aula5appspringdatas.repo;

import com.datas.aula5appspringdatas.model.Tarefas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefasRepository extends JpaRepository<Tarefas, Long> {
}
