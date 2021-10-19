package com.example.aula8appspringcrud.controller;

import com.example.aula8appspringcrud.model.ClienteModel;
import com.example.aula8appspringcrud.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping("/listar/clientes")
    public List<ClienteModel> findAll() {
        return clienteRepository.findAll();
    }

    @PostMapping("/clientes/salvar")
    ResponseEntity<ClienteModel> save(@RequestBody ClienteModel clientinho) {
        return ResponseEntity.status(HttpStatus.CREATED).body(clienteRepository.save(clientinho));
    }
}
