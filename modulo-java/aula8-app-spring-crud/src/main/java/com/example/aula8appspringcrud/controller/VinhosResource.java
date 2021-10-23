package com.example.aula8appspringcrud.controller;

import com.example.aula8appspringcrud.model.Vinho;
import com.example.aula8appspringcrud.repository.VinhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vinhos")
public class VinhosResource {

    @Autowired
    private VinhoRepository repository;

    @GetMapping
    public ResponseEntity<List<Vinho>> listar() {
        return ResponseEntity.ok().body(repository.findAll());
    }

//    @PostMapping
//    public ResponseEntity<Vinho> create(@RequestBody Vinho vinho) {
//
//    }
}
