package com.panacademy.aula19springtestjunitintegracao.bancodedados;

import com.panacademy.aula19springtestjunitintegracao.ContatoModel;
import com.panacademy.aula19springtestjunitintegracao.ContatoRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.validation.ConstraintViolationException;
import java.util.List;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ContatoRepositoryTest {

    @Autowired
    private ContatoRepository contatoRepository;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    private ContatoModel contato;

    @Before
    public void start() {
        contato = new ContatoModel("Chefe", "0y", "9xxxxxxx9");
    }

    @Test
    public void saveComDddNuloDeveLancarException() throws Exception {
        expectedException.expect(ConstraintViolationException.class);
        expectedException.expectMessage("O DDDa deve ser preenchido");

        contato.setDdd(null);
        contatoRepository.save(contato);
    }

    @Test
    public void saveComTelefoneNuloDeveLancarException() throws Exception {
        expectedException.expect(ConstraintViolationException.class);
        expectedException.expectMessage("O Telefone deve ser preenchido");

        contato.setTelefone(null);
        contatoRepository.save(contato);
    }

    @Test
    public void saveComNomeNuloDeveLancarException() throws Exception {
        expectedException.expect(ConstraintViolationException.class);
        expectedException.expectMessage("O Nome deve ser preenchido");

        contato.setNome(null);
        contatoRepository.save(contato);
    }

    @Test
    public void saveDeveSalvarContato() {
        contatoRepository.save(contato);
        List<ContatoModel> contatos = contatoRepository.findAll();
        Assert.assertEquals(1, contatos.size());
        contatoRepository.deleteAll();
    }

    @Test
    public void deleteByIdDeveRemoverContato() {
        contatoRepository.save(contato);
        List<ContatoModel> contatos = contatoRepository.findAll();
        Assert.assertEquals(1, contatos.size());

        contatoRepository.deleteById(contato.getId());
        List<ContatoModel> resultado = contatoRepository.findAll();
        Assert.assertEquals(0, resultado.size());
    }

}
