package com.panacademy.aula19springappcrudaws.controller;

import com.panacademy.aula19springappcrudaws.model.Topico;
import com.panacademy.aula19springappcrudaws.repository.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/topico")
public class TopicoController {

    @Autowired
    private TopicoRepository repository;

    @GetMapping
    public ResponseEntity<List<Topico>> getAll(){
        return ResponseEntity.ok(repository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Topico> getById(@PathVariable long id){
        return repository.findById(id).map(resp -> ResponseEntity.ok(resp))
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/nome/{nome}")
    public ResponseEntity<List<Topico>> getByName(@PathVariable String nome){
        return ResponseEntity.ok(repository.findAllByTopicoContainingIgnoreCase(nome));
    }

    @PostMapping
    public ResponseEntity<Topico> post (@RequestBody Topico topico){
        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(topico));
    }

    @PutMapping
    public ResponseEntity<Topico> put (@RequestBody Topico topico){
        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(topico));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        repository.deleteById(id);
    }

}
