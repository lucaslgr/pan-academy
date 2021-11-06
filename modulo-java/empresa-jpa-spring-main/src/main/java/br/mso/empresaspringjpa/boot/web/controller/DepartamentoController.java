package br.mso.empresaspringjpa.boot.web.controller;

import br.mso.empresaspringjpa.boot.domain.Departamento;
import br.mso.empresaspringjpa.boot.service.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/departamentos")
public class DepartamentoController {
  
  @Autowired
  private DepartamentoService service;
  
  @RequestMapping(method = RequestMethod.GET, value = "/cadastrar")
  public String cadastrar(Departamento departamento) {
    return "/departamento/cadastro.html";
  }
  
  @RequestMapping(method = RequestMethod.GET, value = "/listar")
  public String listar(ModelMap model) {
    model.addAttribute("departamentos", service.buscarTodos());
    return "/departamento/lista";
  }
  
  @RequestMapping(method = RequestMethod.POST, value = "/salvar")
  public String salvar(Departamento departamento) {
    service.salvar(departamento);
    return "redirect:/departamentos/cadastrar";
  }
  
  @RequestMapping(method = RequestMethod.GET, value = "/editar/{id}")
  public String preEditar(@PathVariable("id") Long id, ModelMap model) {
    model.addAttribute("departamento", service.buscarPorId(id));
    return "/departamento/cadastro";
  }
  
  @RequestMapping(method = RequestMethod.POST, value = "/editar")
  public String editar(Departamento departamento) {
    service.editar(departamento);
    return "redirect:/departamentos/cadastrar";
  }

  @RequestMapping(method = RequestMethod.GET, value = "/excluir/{id}")
  public String excluir(@PathVariable("id") Long id, ModelMap model) {
    if (!service.departamentoTemCargos(id)){
      service.excluir(id);
    }
    return listar(model);
  }
}
