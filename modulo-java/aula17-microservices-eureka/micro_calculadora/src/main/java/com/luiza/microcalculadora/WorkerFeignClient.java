package com.luiza.microcalculadora;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.luiza.microcalculadora.model.Tabela;

@Component
@FeignClient(name = "micro-tabela", path = "/tabela")
public interface WorkerFeignClient {

	//primeira parte 
	@GetMapping(value = "/{id}")
	ResponseEntity<Tabela> findById(@PathVariable Long id);
}