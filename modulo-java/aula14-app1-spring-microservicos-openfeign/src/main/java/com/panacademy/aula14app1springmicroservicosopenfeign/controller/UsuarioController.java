package com.panacademy.aula14app1springmicroservicosopenfeign.controller;

import com.panacademy.aula14app1springmicroservicosopenfeign.Exceptions.RecursoNaoEncontrado;
import com.panacademy.aula14app1springmicroservicosopenfeign.model.Usuario;
import com.panacademy.aula14app1springmicroservicosopenfeign.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("app1/usuarios")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @GetMapping
    public ResponseEntity<List<Usuario>> getAll() {
        return new ResponseEntity<>(usuarioService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> getById(@PathVariable final long id) {
        Optional<Usuario> usuario = usuarioService.getById(id);
        if (usuario.isPresent()) {
            return new ResponseEntity<>(usuario.get(), HttpStatus.OK);
        }
        else {
            throw new RecursoNaoEncontrado();
        }
    }
}
