package com.panacademy.aula14app2springmicroservicosopenfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class Aula14App2SpringMicroservicosOpenfeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(Aula14App2SpringMicroservicosOpenfeignApplication.class, args);
    }

}
