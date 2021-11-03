package ConversionMethods;

import org.json.CDL;
import org.json.JSONArray;
import org.json.JSONObject;

public class CDLConversions {
    public static void main(String[] args) {
        CDLToExampleConversion();
        CDLFromExampleConversion();
    }

    /**
     * A partir de 2 Strings com dados em formato JSON, instancia 2 JSONObject respectivamente e posteriormente junta eles em um
     * JSONArray, em seguida converte o JSONArry em uma String com dados no formato CDL através do método CDL.toString(array)
     */
    private static void CDLToExampleConversion() {

        //Instancia uma String com dados no formato JSON
        String string = "{\"0\":\"value\",\"1\":5,\"2\":-2.345E68,\"3\":true}";
        //Instancia um JSONObject a partir da String com dados no formato JSON
        JSONObject example = new JSONObject(string);

        //Instancia uma String com dados no formato JSON
        String string2 = "{\"0\":\"value2\",\"1\":6,\"2\":-8.345E68,\"3\":false}";
        //Instancia um JSONObject a partir da String com dados no formato JSON
        JSONObject example2 = new JSONObject(string2);

        //Instancia um JSONArray vazio
        JSONArray array = new JSONArray();
        //Coloca os dois JSONObject instanciados acima dentro de um JSONArray atraves de um método put
        array.put(example);
        array.put(example2);

        //Converte um os dados do JSONArray para uma String com dados em formato CDL atraves do método estatico da classe CDL.toString
        String output = CDL.toString(array);
        //Imprime o resultado
        System.out.println("Final CDL: \r\n" + output);
    }

    /**
     * A partir de uma String com dados no formato CDL converte em um JSONArray atraves do metodo CDL.toJSONArray(string) e imprime
     */
    private static void CDLFromExampleConversion() {
        //Instancia uma String com dados no formato CDL
        String string = "0,1,2,3\n"
                + "value,5,-2.345E+68,true\n"
                + "value2,6,-8.345E+68,false";

        //Atraves do metodo CDL.toJSONArray(string) converte a String com dados no formato CDL em um objeto JSONArray
        JSONArray output = CDL.toJSONArray(string);
        //Imprime o JSONArray
        System.out.println("Final JSONArray: " + output);
    }
}
