package com.example.aula18springfeign;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Repo extends JpaRepository<Usuario, Long> {

}
