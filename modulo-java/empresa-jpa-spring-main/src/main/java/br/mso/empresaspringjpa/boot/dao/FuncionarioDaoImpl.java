package br.mso.empresaspringjpa.boot.dao;

import br.mso.empresaspringjpa.boot.domain.Funcionario;
import org.springframework.stereotype.Repository;

@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionario, Long> implements FuncionarioDao {

}
