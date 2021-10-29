package com.exercicio.aula17exerciciojsonobject;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

@SpringBootApplication
public class Aula17ExercicioJsonObjectApplication {

    public static void main(String[] args) throws FileNotFoundException {
        SpringApplication.run(Aula17ExercicioJsonObjectApplication.class, args);

        String caminhoDoArquivo = "./aula17-exercicio-json-object/src/main/java/com/exercicio/aula17exerciciojsonobject/";
        String nomeDoArquivo = "cadastros.json";
        String caminhoArquivoCompleto = caminhoDoArquivo+nomeDoArquivo;

        try {
            escreveMultiplosObjetosJSON(caminhoArquivoCompleto);
            leMultiplosObjetosDoJSON(caminhoArquivoCompleto);
        } catch (IOException | ParseException e) {
            System.out.println(e.getMessage());
        }

    }

    private static void leMultiplosObjetosDoJSON(String caminhoArquivo) throws IOException, ParseException {
        JSONArray jsonArray = (JSONArray)  new JSONParser().parse(new FileReader(caminhoArquivo));
        jsonArray.forEach(cadaObjetoJSON -> System.out.println(cadaObjetoJSON.toString()));
    }

    private static void escreveMultiplosObjetosJSON(String caminhoArquivo) throws FileNotFoundException {
        JSONObject lucasGuimaraes = new JSONObject();
        lucasGuimaraes.put("nome", "lucas");
        lucasGuimaraes.put("sobrenome", "guimarães");
        lucasGuimaraes.put("idade", "25");

        JSONObject ironMan = new JSONObject();
        ironMan.put("nome", "Tony");
        ironMan.put("sobrenome", "Stark");
        ironMan.put("idade", "40");


        JSONObject capitaoAmerica = new JSONObject();
        capitaoAmerica.put("nome", "Steve");
        capitaoAmerica.put("sobrenome", "Rogers");
        capitaoAmerica.put("idade", "40");

        JSONObject gaus = new JSONObject();
        gaus.put("nome", "Karl");
        gaus.put("sobrenome", "Friedrich Gaus");
        gaus.put("idade", "75");

        JSONArray jsonArray = new JSONArray();
        jsonArray.add(lucasGuimaraes);
        jsonArray.add(ironMan);
        jsonArray.add(capitaoAmerica);
        jsonArray.add(gaus);

        PrintWriter salvar = new PrintWriter(caminhoArquivo);
        salvar.write(jsonArray.toJSONString());

        salvar.flush();
        salvar.close();
    }

}
