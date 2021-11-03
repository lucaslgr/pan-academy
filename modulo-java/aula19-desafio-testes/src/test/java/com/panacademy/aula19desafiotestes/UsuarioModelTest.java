package com.panacademy.aula19desafiotestes;

import junit.framework.TestCase;

import javax.validation.ConstraintViolationException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@DataJpaTest
public class UsuarioModelTest {
    @Autowired
    private UsuarioRepository repository;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    private UsuarioModel usuario;

    @Before
    public void start() {
        usuario = new UsuarioModel("hanna", "menezes", "hanna@gmail.com");
    }

    @Test
    public void saveComNomeNuloDeveLancarException() throws Exception {
        expectedException.expect(ConstraintViolationException.class);
        expectedException.expectMessage("O nome deve ser preenchido");

        usuario.setNome(null);
        repository.save(usuario);
    }

    @Test
    public void saveDeveSalvarModel() {
        repository.save(usuario);
        List<UsuarioModel> contatos = repository.findAll();
        Assert.assertEquals(1, contatos.size());
        repository.deleteAll();
    }

    @Test
    public void deleteByIdDeveRemoverContato() {
        repository.save(usuario);
        List<UsuarioModel> contatos = repository.findAll();
        Assert.assertEquals(1, contatos.size());

        repository.deleteById(usuario.getId());
        List<UsuarioModel> resultado = repository.findAll();
        Assert.assertEquals(0, resultado.size());
    }

}
