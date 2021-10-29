package com.example.aula17appspringmanipulandojson;

import org.json.simple.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

@SpringBootApplication
public class Aula17AppSpringManipulandoJsonApplication {

    public static void main(String[] args) throws FileNotFoundException {
        SpringApplication.run(Aula17AppSpringManipulandoJsonApplication.class, args);

        JSONObject jsonzinho = new JSONObject();
        
        jsonzinho.put("Nome", "Julio");
        jsonzinho.put("Sobrenome", "Smith");
        jsonzinho.put("Idade", "25");
        jsonzinho.put("Nome", "Julio");
        jsonzinho.put("Sobrenome", "Smith");
        jsonzinho.put("Idade", 25);

        System.out.println(jsonzinho);

        PrintWriter salvar = new PrintWriter("/home/lucaslgr/projects/pan-academy/modulo-java/aula17-app-spring-manipulando-json/src/main/java/teste2.json");
        salvar.write(jsonzinho.toJSONString());

        salvar.flush();
        salvar.close();
    }

}
