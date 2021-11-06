package br.mso.empresaspringjpa.boot.dao;

import br.mso.empresaspringjpa.boot.domain.Funcionario;

import java.util.List;

public interface FuncionarioDao {
  
  void save(Funcionario funcionario);
  
  void update(Funcionario funcionario);
  
  void delete(Long id);
  
  Funcionario findById(Long id);
  
  List<Funcionario> findAll();
}
