package com.panacademy.projetospringdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = "com.panacademy.projetospringdocker")
@EntityScan(basePackages = "com.panacademy.projetospringdocker.model")
public class ProjetoSpringDockerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjetoSpringDockerApplication.class, args);
    }

}
