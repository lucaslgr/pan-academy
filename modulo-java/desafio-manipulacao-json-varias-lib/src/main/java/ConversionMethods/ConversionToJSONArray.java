package ConversionMethods;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ConversionToJSONArray {
    public static void main(String[] args) {
        try {
            JSONObjectToArray();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /**
     * Cria um JSONObject a partir de uma string, converte em um JSONArray e imprime
     * @throws JSONException
     */
    private static void JSONObjectToArray() throws JSONException {
        //Instanciando uma string com dados no formato JSON
        String string = "{\"0\":\"value\",\"1\":5,\"2\":-2.345E68,\"3\":true}";

        //Instanciando um JSONObject a partir da string enviada como argumento
        JSONObject example = new JSONObject(string);

        //Criando um JSONArray com o número dos indices de chave setados de 0 até o número máximo do tamanho do JSONObject example
        JSONArray keyStrings = listNumberArray(example.length());

        //Convertendo o JSONOjbect example para um JSONArray e passando o JSONArray com os valores dos indices de chave do novo JSONArray
        JSONArray array = example.toJSONArray(keyStrings);

        //Imprimindo o resultado
        System.out.println("Final JSONArray: " + array);
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
}
