package com.panacademy.projetospringdocker.controller;

import com.panacademy.projetospringdocker.controller.dto.PessoaRequest;
import com.panacademy.projetospringdocker.controller.dto.PessoaResponse;
import com.panacademy.projetospringdocker.model.Pessoa;
import com.panacademy.projetospringdocker.repository.PessoaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {
    private final PessoaRepository pessoaRepository;

    public PessoaController(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public List<PessoaResponse> findAll() {
        List<Pessoa> pessoas = pessoaRepository.findAll();
        return pessoas.stream().map(PessoaResponse::converter).collect(Collectors.toList());
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public PessoaResponse findById(@PathVariable("id") Long id) {
        Pessoa pessoa = pessoaRepository.getById(id);
        return PessoaResponse.converter(pessoa);
    }

    @RequestMapping(method = RequestMethod.POST, value ="/")
    public void savePerson(@RequestBody PessoaRequest pessoaRequest) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(pessoaRequest.getNome());
        pessoa.setSobrenome(pessoaRequest.getSobrenome());

        pessoaRepository.save(pessoa);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public void updatePerson(@PathVariable("id") Long id, @RequestBody PessoaRequest pessoaRequest) throws Exception {
        Optional<Pessoa> pessoa = pessoaRepository.findById(id);

        if (pessoa.isPresent()) {
            Pessoa pessoaSave = pessoa.get();
            pessoaSave.setNome(pessoaRequest.getNome());
            pessoaSave.setSobrenome(pessoaRequest.getSobrenome());
            pessoaRepository.save(pessoaSave);
        } else {
            throw new Exception("Pessoa não encontrada!");
        }
    }
}
