package com.panacademy.aula19springappcrudaws.controller;

import com.panacademy.aula19springappcrudaws.model.Texto;
import com.panacademy.aula19springappcrudaws.repository.TextoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/textos")
@CrossOrigin("*")
public class TextoController {

    @Autowired
    private TextoRepository repository;

    @GetMapping
    public ResponseEntity<List<Texto>> GetAll() {
        return ResponseEntity.ok(repository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Texto> GetById(@PathVariable long id) {
        return repository.findById(id)
                .map(resp -> ResponseEntity.ok(resp))
                .orElse(ResponseEntity.notFound().build());
    }


    @PostMapping
    public ResponseEntity<Texto> post(@RequestBody Texto postagem) {
        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(postagem));
    }

    @PutMapping
    public ResponseEntity<Texto> put(@RequestBody Texto postagem) {
        return ResponseEntity.status(HttpStatus.OK).body(repository.save(postagem));
    }

    @DeleteMapping
    public ResponseEntity<Texto> delete(@PathVariable long id) {
        Optional<Texto> texto = repository.findById(id);
        if(!texto.isEmpty()) {
            repository.deleteById(id);
            return ResponseEntity.status(HttpStatus.OK).build();
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
}
