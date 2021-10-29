package com.luiza.microtabela.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luiza.microtabela.model.Tabela;
import com.luiza.microtabela.repositories.TabelaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;


@RestController
@RequestMapping(value = "/tabela")
public class TabelaResource {
/////////////////////ATENCAO AQUI É O PROJETO MICRO TABELA AGORA
	private static Logger logger = LoggerFactory.getLogger(TabelaResource.class);

	@Autowired
	private Environment env;

	@Autowired
	private TabelaRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Tabela>> findAll() {
		List<Tabela> list = repository.findAll();
		return ResponseEntity.ok(list);
	}	
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Tabela> findById(@PathVariable Long id) {
		logger.info("PORT = " + env.getProperty("local.server.port"));

		Tabela obj = repository.findById(id).get();
		return ResponseEntity.ok(obj);
	}	
}
