package ConversionMethods;

import org.json.Cookie;
import org.json.JSONObject;

public class CookieConversions {
    public static void main(String[] args) {
        CookieToExampleConversion();
        CookieFromExampleConversion();
    }

    /**
     * A partir de uma String com dados no formato JSON converte em uma String com dados no formato de Cookies para web
     */
    private static void CookieToExampleConversion() {
        //Instancia uma String com dados de cookie no formato JSON
        String string = "{\"name\":\"Cookie-Name\",\"value\":\"name\",\"1\":5,\"2\":-2.345E68,\"3\":'true'}";
        //Instancia um JSONOjbect a partir da String com dados de cookies no formato JSON
        JSONObject example = new JSONObject(string);

        //Atraves do metodo estatico toString da classe Cookie converte a String com dados do cookie no formato JSON para
        // uma String com os mesmos dados no formato de Cookie para web
        String output = Cookie.toString(example);

        //Imprime o resultado
        System.out.println("Final Cookie: " + output);
    }

    /**
     * A partir de uma String com dados no formato de cookies para web converte em um JSONObject e imprime os dados no formato JSON
     */
    private static void CookieFromExampleConversion() {

        //Instancia uma String com dados no formato de cookies de navegador
        String string = "Cookie-Name=name;1=5;2=-2.345E%2b68;3=true";

        //A partir do metodo de conversao estatico toJSONObject da classe Cookie converte a String com dados no formato de cookies
        //para um JSONObject
        JSONObject output = Cookie.toJSONObject(string);

        //Imprime o resultado
        System.out.println("Final JSONObject: " + output);
    }
}
