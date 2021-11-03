package com.panacademy.aula19springappcrudaws.repository;

import com.panacademy.aula19springappcrudaws.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
