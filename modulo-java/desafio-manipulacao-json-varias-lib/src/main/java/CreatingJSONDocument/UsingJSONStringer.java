package CreatingJSONDocument;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONStringer;

public class UsingJSONStringer {
    public static void main(String[] args) {
        try {
            JSONExampleStringer();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /**
     * Cria um JSONStringer e adiciona dados de um objeto JSON nele, ao final converte para um JSONObject e imprime
     * @throws JSONException
     */
    private static void JSONExampleStringer() throws JSONException {

        //Instanciando um objeto do tipo JSONStringer
        JSONStringer jsonStringer = new JSONStringer();

        //Ativa o modo de adicionar atributos em um objeto dentro do jsonStringer
        jsonStringer.object();

        //Adicionando elementos no jsonStringer setando chave e valor
        jsonStringer.key("trueValue").value(true);
        jsonStringer.key("falseValue").value(false);
        jsonStringer.key("nullValue").value(null);
        jsonStringer.key("stringValue").value("hello world!");
        jsonStringer.key("complexStringValue").value("h\be\tllo w\u1234orld!");
        jsonStringer.key("intValue").value(42);
        jsonStringer.key("doubleValue").value(-23.45e67);

        //fecha o modo de adicionar atributos dentro do objeto dentro do jsonStringer
        jsonStringer.endObject();

        //Convertendo o JSON criado em uma string
        String str = jsonStringer.toString();
        //Instanciando um JSONObject a partir da string com dados no formato JSON que já inserimos atraves do JSONStringer anteriomente
        JSONObject jsonObject = new JSONObject(str);

        //Imprimindo o jsonObject no final
        System.out.println("Final JSONOBject: " + jsonObject);
    }
}
