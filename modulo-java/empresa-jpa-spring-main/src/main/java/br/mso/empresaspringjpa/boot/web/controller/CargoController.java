package br.mso.empresaspringjpa.boot.web.controller;

import br.mso.empresaspringjpa.boot.domain.Cargo;
import br.mso.empresaspringjpa.boot.domain.Departamento;
import br.mso.empresaspringjpa.boot.service.CargoService;
import br.mso.empresaspringjpa.boot.service.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping(path = "/cargos")
public class CargoController {

  @Autowired
  private CargoService cargoService;

  @Autowired
  private DepartamentoService departamentoService;

  //  @GetMapping(path = "/cadastrar")
  @RequestMapping(method = RequestMethod.GET, value = "/cadastrar")
  public String cadastrar() {

    List<Departamento> departamentosList = departamentoService.buscarTodos();

    return "/cargo/cadastro.html";
  }

  @RequestMapping(method = RequestMethod.POST, value = "/salvar")
  public String salvar(Cargo cargo) {
    cargoService.salvar(cargo);
    return "redirect:/cargo/cadastrar";
  }
  
  @RequestMapping(method = RequestMethod.GET, value = "/listar")
//  @GetMapping("/listar")
  public String listar() {
    return "/cargo/lista.html";
  }
}
