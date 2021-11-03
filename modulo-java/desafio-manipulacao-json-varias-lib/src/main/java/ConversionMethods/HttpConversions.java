package ConversionMethods;

import org.json.HTTP;
import org.json.JSONObject;

public class HttpConversions {
    public static void main(String[] args) {
        HTTPToExampleConversion();
        HTTPFromExampleConversion();
    }

    /**
     * A partir de uma String com dados no formato JSON converte em uma String com dados no formato HTTP
     */
    private static void HTTPToExampleConversion() {

        //Instancia uma String com dados de um cabecalho HTTP no formato JSON
        String string = "{\"Method\":\"POST\",\"Request-URI\":'/',\"HTTP-Version\":'HTTP/1.1',\"Value1\":true,\"Value2\":2,\"Value3\":-2.345E68}";

        //Instancia um objeto JSONOjbect a partir da String com dados no formato JSON
        JSONObject example = new JSONObject(string);

        //Converte os dados no formato JSON para o formato HTTP
        String output = HTTP.toString(example);

        //Imprime os dados no formato JSON
        System.out.println("Final HTTP: " + output);
    }

    /**
     * A partir de uma String com dados no formato HTTP, converte em uma String com dados no formato JSON
     */
    private static void HTTPFromExampleConversion() {

        //Instancia uma String com dados no formato HTTP
        String string = "Final HTTP: POST '/' HTTP/1.1 Value3: -2.345E+68 Value1: true Value2: 2";

        //Converte os dados contidos na String no formato HTTP para um JSONObject
        JSONObject output = HTTP.toJSONObject(string);

        //Imprime os dados no formato JSON
        System.out.println("Final JSONObject: " + output);
    }
}
