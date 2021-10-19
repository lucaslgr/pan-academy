package com.example.aula8appspringcrud.repository;

import com.example.aula8appspringcrud.model.ClienteModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<ClienteModel, Long> {
}
