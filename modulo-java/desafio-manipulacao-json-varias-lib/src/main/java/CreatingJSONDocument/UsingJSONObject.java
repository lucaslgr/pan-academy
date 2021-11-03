package CreatingJSONDocument;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class UsingJSONObject {
    public static void main(String[] args) {
        try {
            JSONExampleObject1();
            JSONExampleObject2();
            JSONExampleObject3();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /** Exemplo 1
     * Cria um JSONObject a partir de uma string com dados no formato JSON
     * @throws JSONException
     */
    private static void JSONExampleObject1() throws JSONException {
        //Instanciando uma string com dados no formato JSON
        String string = "{\"0\":\"value\",\"1\":5,\"2\":-2.345E68,\"3\":true}";

        //Instanciando um objeto do tipo JSONObject passando a string acima com parametro
        JSONObject example = new JSONObject(string);

        //Imprimindo o JSONObject instanciado
        System.out.println("Final JSONObject: " + example);
    }

    /** Exemplo 2
     * Criando um JSON setando os atributos com chave e valor dinamicamente pelo metodo put
     * @throws JSONException
     */
    private static void JSONExampleObject2() throws JSONException {

        //Instanciando um objeto do tipo JSONObject vazio
        JSONObject example = new JSONObject();

        //Adicionando um atributo com chave "key" e valor "value" nesse objeto
        example.put("key",
                "value");

        //Adicionando mais atributos setando chave e valor
        example.put("key2", 5);
        example.put("key3", -23.45e67);
        example.put("trueValue", true);

        //OBS: Não pode-se inserir valores null
        //example.put("nullValue", null);

        //Imprimindo o JSONObject
        System.out.println("Final JSONOBject: " + example);
    }

    /** Exemplo 3
     * Cria um HashMap, adiciona atributos com chave e valor, converte para um JSONObject e imprime
     */
    private static void JSONExampleObject3() {

        //Instancia um objeto do tipo HashMap com chave do tipo String e valor do tipo Double
        Map<String,Double> map = new HashMap<String, Double>();

        //Adiciona elementos com chave e valor atraves do metodo put ao HashMap criado
        map.put("key1", 1.0);
        map.put("key2", -23.45e67);

        //Instancia um JSONObject a partir do HashMap passado como parametro
        JSONObject example = new JSONObject(map);

        //Imprime o JSONObject
        System.out.println("Final JSONOBject: " + example);
    }
}
