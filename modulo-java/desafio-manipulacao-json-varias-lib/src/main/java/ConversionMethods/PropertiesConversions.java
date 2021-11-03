package ConversionMethods;

import org.json.JSONObject;
import org.json.Property;

import java.util.Properties;

public class PropertiesConversions {
    public static void main(String[] args) {
        PropertyToExampleConversion();
        PropertyFromExampleConversion();
    }

    /**
     * A partir de uma String com dados no formato JSON converte para um objeto do tipo Properties com dados no formato
     * properties utilizando Property.toProperties(example)
     * @return
     */
    private static Properties PropertyToExampleConversion() {

        //Instancia uma String com dados no formato JSON
        String string = "{\"0\":\"value\",\"1\":5,\"2\":-2.345E68,\"3\":true}";
        //Instancia um JSONObject a partir da String com dados no formato JSON
        JSONObject example = new JSONObject(string);

        //Utiliza o metodo Property.toProperties para converter os dados do JSONObject em um Objeto Properties
        Properties output = Property.toProperties(example);
        //Imprime os dados do objeto Properties
        System.out.println("Final Properties: " + output);
        //Retorna a saida
        return output;
    }

    /**
     * A partir de um objeto Properties com dados no formato properties converte em um JSONObject e imprime o resultado
     */
    private static void PropertyFromExampleConversion() {

        //Atribui uma instancia de um objeto Properties retornado da funcao PropertyToExampleConversion
        Properties input = PropertyToExampleConversion();

        //Converte o objeto Properties + os dados em um JSONObject
        JSONObject output = Property.toJSONObject(input);

        //Imprrime o JSONObject com os dados no formato JSON
        System.out.println("Final JSONObject: " + output);
    }
}
