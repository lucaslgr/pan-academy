package com.panacademy.aula18springfeignclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class UsuarioController {

    @Autowired
    UsuarioAula1Feign usuarioAula1;

    @GetMapping("hello")
    public String testar () {
        return "Hello";
    }

    @GetMapping
    public ResponseEntity<ResponseEntity<List<Usuario>>> getTodos(){
        return ResponseEntity.ok(usuarioAula1.getAll());
    }

    @GetMapping("/listar/body")
    public ResponseEntity<List<Usuario>> getTodosBody(){
        return ResponseEntity.ok(usuarioAula1.getAll().getBody());
    }


}