package CreatingJSONDocument;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class UsingJSONArray {
    public static void main(String[] args){
        try {
            JSONExampleArray1();
            JSONExampleArray2();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /** Exemplo 1
     * Cria um JSONObject a partir de uma String no formato JSON contendo um array de objetos em JSON
     * @throws JSONException
     */
    private static void JSONExampleArray1() throws JSONException {
        //Primeiramente declaramos um array de objetos em JSON dentro da String
        String arrayStr = "["+"true,"
                        +"false,"+
                        "\"true\","+
                        "\"false\","+
                        "\"hello\","+
                        "23.45e-4,"+
                        "\"23.45\","+
                        "42,"+
                        "\"43\","+
                        "["+"\"world\""+"],"+
                        "{"+
                            "\"key1\":\"value1\","+
                            "\"key2\":\"value2\","+
                            "\"key3\":\"value3\","+
                            "\"key4\":\"value4\""+
                        "},"+
                        "0,"+
                        "\"-1\""+
                        "]";

        //Instanciamos um JSONArray passando a string como parâmetro
        JSONArray array = new JSONArray(arrayStr);
        //Imprime JSONArray, os valores de cada posicao
        System.out.println("Values array: "+ array);

        //Criando um array com os indices setados nas chaves respectivo ao tamanho do array lido
        JSONArray list = listNumberArray(array.length());
        //Imprimindo os jsonArray só com os indices setados
        System.out.println("Label Array: "+ list.toString());

        //Construindo um JSONObject mesclando os valores do JSONArray da variavel array com os valores de indices do JSONArray da variavel list
        JSONObject object = array.toJSONObject(list);
        //Imprimindo o JSONObject final montado
        System.out.println("Final JSONOBject: " + object);
    }

    /**
     * Cria um JSONArray com os valores chave setados de 0 até o argumento max(int) e retorna esse JSONArray
     * @param max
     * @return JSONArray
     */
    private static JSONArray listNumberArray(int max){
        JSONArray res = new JSONArray();
        for (int i=0; i<max;i++) {
            //The value of the labels must be an String in order to make it work
            res.put(String.valueOf(i));
        }
        return res;
    }

    /** Exemplo 2
     * Cria um array vazio e vai adicionando os dados sem precisar de uma String com os dados no formato JSON
     * @throws JSONException
     */
    private static void JSONExampleArray2() throws JSONException {

        //Instanciando um objeto JSONArray vazio
        JSONArray array = new JSONArray();

        //Adicionando elementos no array com método .put
        array.put("value");
        array.put(5);
        array.put(-23.45e67);
        array.put(true);

        //Criando um array com os indices setados nas chaves respectivo ao tamanho do JSONArray da variavel array
        JSONArray list = listNumberArray(array.length());
        //Construindo um JSONObject mesclando os valores do JSONArray da variavel array com os valores de indices do JSONArray da variavel list
        JSONObject object = array.toJSONObject(list);
        //Imprimindo o JSONObject final montado
        System.out.println("Final JSONObject: " + object);
    }
}
