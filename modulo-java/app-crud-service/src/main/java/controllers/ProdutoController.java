package controllers;

import models.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.ProdutoService;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/produtos")
public class ProdutoController {

    //http://localhost:8089/swagger-ui.html
    @Autowired
    ProdutoService produtoService;

    @GetMapping(value = "/listar")
    public ResponseEntity<Object> getProduto() {
        return new ResponseEntity<>(produtoService.getProdutos(), HttpStatus.OK);
    }

    @GetMapping("/deletar")
    public ResponseEntity<Object> delete(@PathVariable(value = "id") String id) {
        produtoService.deleteProduto(id);
        return new ResponseEntity<>("Produto deletado com sucesso", HttpStatus.OK);
    }

    @PostMapping("/produtos")
    public ResponseEntity<Object> createProduto(@RequestBody Produto produto) {
        produtoService.createProduto(produto);
        return new ResponseEntity<>("Produto criado", HttpStatus.CREATED);
    }
}
