package br.mso.empresaspringjpa.boot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {
  
  @RequestMapping(method = RequestMethod.GET, value = "/home")
//  @GetMapping("/home")
  public String home() {
    return "home.html";
  }

}
