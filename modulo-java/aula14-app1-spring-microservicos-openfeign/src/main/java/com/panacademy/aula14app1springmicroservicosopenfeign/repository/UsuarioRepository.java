package com.panacademy.aula14app1springmicroservicosopenfeign.repository;

import com.panacademy.aula14app1springmicroservicosopenfeign.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
