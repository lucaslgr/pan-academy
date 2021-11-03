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
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * O exercício requisitado de fazer um loop pelos atributos de um objeto JSON está implementado dentro do método leMultiplosObjetosDoJSON
 */

@SpringBootApplication
public class Aula17ExercicioJsonObjectApplication {

    public static void main(String[] args) throws FileNotFoundException {
        SpringApplication.run(Aula17ExercicioJsonObjectApplication.class, args);

        //Declarando o caminho da pasta onde deverá ser escrito/lido o arquivo
        String caminhoDoArquivo = "./aula17-exercicio-json-object/src/main/java/com/exercicio/aula17exerciciojsonobject/";
        //Declarando o nome do arquivo
        String nomeDoArquivo = "cadastros.json";
        //Juntando caminho+nome do arquivo
        String caminhoArquivoCompleto = caminhoDoArquivo+nomeDoArquivo;

        try {
            //Executa funcao que escreve os dados no formato JSON dentro do arquivo
            escreveMultiplosObjetosJSON(caminhoArquivoCompleto);
            //Executa a funcao que le os dados no formato JSON dentro do arquivo e percorre todos objetos e seus atributos printando-os na tela
            leMultiplosObjetosDoJSON(caminhoArquivoCompleto);
        } catch (IOException | ParseException e) {
            System.out.println(e.getMessage());
        }

    }

    /**
     * Lê o arquivo no formato JSON respectivo ao caminho passado no parâmetro e printa os dados
     * @param caminhoArquivo caminho do arquivo onde vai ser lido os dados
     * @throws IOException
     * @throws ParseException
     */
    private static void leMultiplosObjetosDoJSON(String caminhoArquivo) throws IOException, ParseException {
        //Instancia um JSONParses para pegar a String lida do arquivo com FileReader e transformar em JSON, posteriormente é
        //realizado um cast para JSONArray
        JSONArray jsonArray = (JSONArray)  new JSONParser().parse(new FileReader(caminhoArquivo));

        //Pega um iterator para JSONObject respectivo ao jsonArray lido
        Iterator<JSONObject> iteratorObjetoJSON = jsonArray.iterator();

        //Iteração por cada objeto JSON do array de objetos
        while(iteratorObjetoJSON.hasNext()) {
            //Pega o proximo objeto JSON no iterator e faz um cast para JSONObject
            JSONObject objetoJSONAtual = (JSONObject) iteratorObjetoJSON.next();

            //Pega todos atributos do objeto JSON atual e joga para dentro de um Set de Map para guardar chave e valor
            Set<Map.Entry<String, String>> atributos = objetoJSONAtual.entrySet();
            //Iteração por cada atributo do objeto JSON atual imprimindo CHAVE e VALOR de cada atributo
            for(Map.Entry<String, String> atributo : atributos) {
                //Imprimindo chave e valor separadamente dos atributos
                System.out.println("Chave: " + atributo.getKey() + " | Valor: " + atributo.getValue());
            }

            //Printa uma separação na tela
            System.out.println("-".repeat(50));
        }
    }

    /**
     * Método criado para escrever multiplos objetos em um arquivo JSON para que possa ser lido de forma que foi pedido no exercício
     * @param caminhoArquivo caminho do arquivo onde vai ser armazenado os dados
     * @throws FileNotFoundException
     */
    private static void escreveMultiplosObjetosJSON(String caminhoArquivo) throws FileNotFoundException {
        //Instanciando um objeto do tipo JSONObject
        JSONObject lucasGuimaraes = new JSONObject();
        //Setando atributos com chave e valor para o respectivo objeto instanciado acima
        lucasGuimaraes.put("nome", "lucas");
        lucasGuimaraes.put("sobrenome", "guimarães");
        lucasGuimaraes.put("idade", "25");

        //Instanciando um objeto do tipo JSONObject
        JSONObject ironMan = new JSONObject();
        //Setando atributos com chave e valor para o respectivo objeto instanciado acima
        ironMan.put("nome", "Tony");
        ironMan.put("sobrenome", "Stark");
        ironMan.put("idade", "40");

        //Instanciando um objeto do tipo JSONObject
        JSONObject capitaoAmerica = new JSONObject();
        //Setando atributos com chave e valor para o respectivo objeto instanciado acima
        capitaoAmerica.put("nome", "Steve");
        capitaoAmerica.put("sobrenome", "Rogers");
        capitaoAmerica.put("idade", "40");

        //Instanciando um objeto do tipo JSONObject
        JSONObject gaus = new JSONObject();
        //Setando atributos com chave e valor para o respectivo objeto instanciado acima
        gaus.put("nome", "Karl");
        gaus.put("sobrenome", "Friedrich Gaus");
        gaus.put("idade", "75");

        //Instanciando um objeto do tipo JSONArray
        JSONArray jsonArray = new JSONArray();
        //Adicionando cada JSONObject dentro do array
        jsonArray.add(lucasGuimaraes);
        jsonArray.add(ironMan);
        jsonArray.add(capitaoAmerica);
        jsonArray.add(gaus);

        //Instanciando um objeto do tipo PrintWriter com o caminho+nome do arquivo onde os dados deverão ser escritos
        PrintWriter salvar = new PrintWriter(caminhoArquivo);
        //Escrevendo os dados do jsonArray dentro do arquivo aberto
        salvar.write(jsonArray.toJSONString());

        //Limpando o buffer do PrintWriter
        salvar.flush();
        //Fechando o arquivo
        salvar.close();
    }

}
