package com.luiza.microtabela;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MicroTabelaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroTabelaApplication.class, args);
	}

}
