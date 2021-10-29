package com.example.aula17appspringmanipulandojson;

import org.json.simple.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

@SpringBootApplication
public class ManipulandoJson {
    public static void main(String[] args) throws FileNotFoundException {
        SpringApplication.run(ManipulandoJson.class, args);
        JSONObject jsonzinho = new JSONObject();
        jsonzinho.put("Nome", "Julio");
        jsonzinho.put("Sobrenome", "Smith");
        jsonzinho.put("idade", 25);
        jsonzinho.put("Nome", "Julio");
        jsonzinho.put("Sobrenome", "Smith");
        jsonzinho.put("idade", 25);
        JSONObject jsonzinho2 = new JSONObject();
        jsonzinho2.put("Nome", "Julio");
        jsonzinho2.put("Sobrenome", "Smith");
        jsonzinho2.put("idade", 25);
        System.out.println(jsonzinho);
        System.out.println(jsonzinho2);

        PrintWriter salvar = new PrintWriter("/home/lucaslgr/projects/pan-academy/modulo-java/aula17-app-spring-manipulando-json/src/main/java/teste4.json");
        salvar.write("[");
        salvar.write(jsonzinho.toJSONString());
        salvar.write(",");
        salvar.write(jsonzinho2.toJSONString());
        salvar.write("]");
        salvar.flush();
        salvar.close();
    }
}