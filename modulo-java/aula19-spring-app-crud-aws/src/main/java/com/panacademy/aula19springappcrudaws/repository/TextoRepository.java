package com.panacademy.aula19springappcrudaws.repository;

import com.panacademy.aula19springappcrudaws.model.Texto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TextoRepository  extends JpaRepository<Texto, Long> {
}
