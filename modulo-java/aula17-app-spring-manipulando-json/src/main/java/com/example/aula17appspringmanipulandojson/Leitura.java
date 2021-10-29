package com.example.aula17appspringmanipulandojson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Leitura {
    public static void main(String[] args) throws IOException, ParseException {
        // Java program to read JSON from a file
        Object obj = new JSONParser().parse(new FileReader("/home/lucaslgr/projects/pan-academy/modulo-java/aula17-app-spring-manipulando-json/src/main/java/teste2.json"));
        JSONObject jsonzinho = (JSONObject) obj;

        // get nome
        String nominho = (String) jsonzinho.get("Nome");
        String sobrenominho = (String) jsonzinho.get("Sobrenome");
        long idade = (long) jsonzinho.get("Idade");
        System.out.println(nominho);
        System.out.println(sobrenominho);
        System.out.println(idade);
    }
}
