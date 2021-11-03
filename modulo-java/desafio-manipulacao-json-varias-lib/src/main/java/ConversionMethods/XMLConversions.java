package ConversionMethods;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;

public class XMLConversions {

    public static void main(String[] args) {
        XMLToExampleConversion();
        XMLFromExampleConversion();
    }

    /**
     * A partir de uma String com dados no formato JSON, cria um JSONObject e converte para um objeto com dados no formato XML e printa
     * @throws JSONException
     */
    private static void XMLToExampleConversion() throws JSONException {

        //Instancia uma String com dados no formato JSON
        String string = "{\"0\":\"value\",\"1\":5,\"2\":-2.345E68,\"3\":true}";
        //Instancia um JSONObject a partir da string dada como argumento
        JSONObject example = new JSONObject(string);

        //Converte o JSONObject para String no formato XML
        String output = XML.toString(example);

        //Printa na tela o resultado
        System.out.println("Final XML: " + output);
    }

    /**
     * A partir de uma string com dados no formato XML converte para um JSONOjbect e depois imprime na tela
     */
    private static void XMLFromExampleConversion() {

        //Instancia uma string com dados no formato XML
        String string = "<0>value</0><1>5</1><2>-2.345E+68</2><3>true</3>";

        //Converte os dados da string no formato XML para um JSONOjbect
        JSONObject output = XML.toJSONObject(string);

        //Imprime o JSONobject
        System.out.println("Final JSONObject: " + output);
    }

}
