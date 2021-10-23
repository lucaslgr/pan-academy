package com.example.aula13appspringmicrotabela.resource;

import com.example.aula13appspringmicrotabela.model.Tabela;
import com.example.aula13appspringmicrotabela.repository.TabelaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/tabela")
public class TabelaResource {

    @Autowired
    private TabelaRepository repository;

    @GetMapping
    public ResponseEntity<List<Tabela>> findAll() {
        List<Tabela> list = repository.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Tabela> findById(@PathVariable Long id) {
        Tabela obj = repository.findById(id).get();
        return ResponseEntity.ok(obj);
    }

}
