package com.luiza.microcalculadora.resources;

import org.hibernate.cfg.Environment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luiza.microcalculadora.Repo.Repo;
import com.luiza.microcalculadora.model.Calculadora;
import com.luiza.microcalculadora.model.Tabela;
import com.luiza.microcalculadora.services.CalculadoraService;

@RestController
@RequestMapping(value = "/resultado")
public class CalculadoraResource {

	@Autowired
	private CalculadoraService service;
	
	
	


	
	@Autowired
	private Repo clienteReposity;
	
	@GetMapping(value = "/{tabelaId}/multiplique/{dias}")
	public ResponseEntity<Calculadora> getPayment(@PathVariable Long tabelaId, @PathVariable Integer dias) {
		Calculadora calculadora = service.getCalculo(tabelaId, dias);
		return ResponseEntity.ok(calculadora);
	}	
	
	@PostMapping
	ResponseEntity<Calculadora> post(@RequestBody Calculadora clientinho) {

		return ResponseEntity.status(HttpStatus.CREATED).body(clienteReposity.save(clientinho));
	}
	

}







