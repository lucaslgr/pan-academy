package br.mso.empresaspringjpa.boot.service;

import java.util.List;

import br.mso.empresaspringjpa.boot.dao.DepartamentoDao;
import br.mso.empresaspringjpa.boot.domain.Departamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DepartamentoServiceImpl implements DepartamentoService {
  
  @Autowired
  private DepartamentoDao dao;
  
  @Transactional(readOnly = false)
  @Override
  public void salvar(Departamento departamento) {
    dao.save(departamento);
  }
  
  @Transactional(readOnly = false)
  @Override
  public void editar(Departamento departamento) {
    dao.update(departamento);
  }
  
  @Transactional(readOnly = false)
  @Override
  public void excluir(Long id) {
    dao.delete(id);
  }
  
  @Transactional(readOnly = true)
  @Override
  public Departamento buscarPorId(Long id) {
    
    return dao.findById(id);
  }
  
  @Transactional(readOnly = true)
  @Override
  public List<Departamento> buscarTodos() {
    
    return dao.findAll();
  }
  
  public boolean departamentoTemCargos(Long id) {
    if (buscarPorId(id).getCargos().isEmpty()) {
      return false;
    }
    return true;
  }
  
}

