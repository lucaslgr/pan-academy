package com.panacademy.aula13appspringmicrocalculadora.controller;

import com.panacademy.aula13appspringmicrocalculadora.model.Calculadora;
import com.panacademy.aula13appspringmicrocalculadora.service.CalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "calculadora_resultado")
public class CalculadoraResource {

    @Autowired
    private CalculadoraService service;

    @GetMapping(value = "/{tabelaId}/multiplique/{dias}")
    public ResponseEntity<Calculadora> getPayment(@PathVariable Long tabelaId, @PathVariable Integer dias) {
        Calculadora calculadora = service.getCalculo(tabelaId, dias);
        return ResponseEntity.ok(calculadora);
    }
}
