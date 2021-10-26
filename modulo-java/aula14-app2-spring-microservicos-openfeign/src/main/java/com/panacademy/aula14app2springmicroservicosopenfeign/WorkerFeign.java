package com.panacademy.aula14app2springmicroservicosopenfeign;

import com.panacademy.aula14app2springmicroservicosopenfeign.model.Usuario;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Component
@FeignClient(name = "app1", url="localhost:8081", path="app1/usuarios")
public interface WorkerFeign {

    @GetMapping
    public ResponseEntity<List<Usuario>> getAll();
}
