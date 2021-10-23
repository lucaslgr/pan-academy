package com.example.aula8appspringcrud.repository;

import com.example.aula8appspringcrud.model.Vinho;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VinhoRepository extends JpaRepository<Vinho, Long> {
}
