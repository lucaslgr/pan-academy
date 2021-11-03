package com.panacademy.aula18springfeignclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class Aula18SpringFeignClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(Aula18SpringFeignClientApplication.class, args);
    }

}
