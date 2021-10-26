package com.panacademy.aula14app1springmicroservicosopenfeign.service;

import com.panacademy.aula14app1springmicroservicosopenfeign.model.Usuario;
import com.panacademy.aula14app1springmicroservicosopenfeign.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public List<Usuario> getAll() {
        return usuarioRepository.findAll();
    }

    public Optional<Usuario> getById(Long id) {
        return usuarioRepository.findById(id);
    }
}
