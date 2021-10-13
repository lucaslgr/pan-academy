package com.classes.appaula1springaws.controller;

import com.classes.appaula1springaws.repository.ProductRepository;
import com.classes.appaula1springaws.table.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
public class Controller {
    @GetMapping("retornoString")
    public String method(){
        return "hello";
    }

    @GetMapping("/retornoNumero")
    public int idade(){
        return 1;
    }

    @Autowired
    private ProductRepository repository;

    @GetMapping("/manutencoes")
    public List<Products> getAll() {
        return repository.findAll();
    }
}

