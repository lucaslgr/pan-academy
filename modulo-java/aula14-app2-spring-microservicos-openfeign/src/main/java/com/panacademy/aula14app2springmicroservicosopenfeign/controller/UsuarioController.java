package com.panacademy.aula14app2springmicroservicosopenfeign.controller;

import com.panacademy.aula14app2springmicroservicosopenfeign.WorkerFeign;
import com.panacademy.aula14app2springmicroservicosopenfeign.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("app2/usuarios")
public class UsuarioController {

    private final String URI_SUBSTITUIDA_ALL = "/app1/usuarios";
    private final String URI_SUBSTITUIDA_ALL_ID = "/app1/usuarios/{id}";

    //COM REST TEMPLATE
    @Value("${api.host.baseurlapp1}")
    private String linkHost;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("resttemplate")
    public ResponseEntity<List<Usuario>> getAllUsuarios() {
        Usuario[] usuariosArray = restTemplate.getForObject(linkHost + URI_SUBSTITUIDA_ALL, Usuario[].class);
        return new ResponseEntity<>(Arrays.asList(usuariosArray), HttpStatus.OK);
    }

    // COM FEIGN
    @Autowired
    WorkerFeign workerFeign;

    @GetMapping("/feign")
    public ResponseEntity<List<Usuario>> getUsersFeign() {
        return ResponseEntity.ok(workerFeign.getAll().getBody());
    }
}
