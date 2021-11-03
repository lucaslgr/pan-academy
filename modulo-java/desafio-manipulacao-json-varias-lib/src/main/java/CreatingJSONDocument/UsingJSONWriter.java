package CreatingJSONDocument;

import org.json.*;

import java.io.StringWriter;

public class UsingJSONWriter {
    public static void main(String[] args) {
        try {
            JSONExamplWriter();
            JSONExampleTokener();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /**
     * Cria um objeto JSON utilizando JSONWriter, adiciona atributos de chave a valor e no final imprime esse objeto
     * @throws JSONException
     */
    private static void JSONExamplWriter() throws JSONException {

        StringWriter write = new StringWriter();
        //Instancia um objeto JSONWriter passando o objeto StringBuilder na variavel write
        JSONWriter jsonWriter = new JSONWriter(write);

        //Ativa o status de adição de atributos de chave e valor dentro de um objeto JSON dentro do jsonWriter
        jsonWriter.object();

        //Adicionando atributos de chave e valor no objeto
        jsonWriter.key("trueValue").value(true);
        jsonWriter.key("falseValue").value(false);
        jsonWriter.key("nullValue").value(null);
        jsonWriter.key("stringValue").value("hello world!");
        jsonWriter.key("complexStringValue").value("h\be\tllo w\u1234orld!");
        jsonWriter.key("intValue").value(42);
        jsonWriter.key("doubleValue").value(-23.45e67);

        //Finaliza a adição de atributos de chave e valor no objeto
        jsonWriter.endObject();

        //Transforma o objeto em String e imprime sem precisar converter em JSONObject
        System.out.println("JSON: " + write.toString());
    }

    /**
     * A partir de una String cria un JSONTokener, e utiliza o objeto JSONTokener criado para converter e manipular com JSONObject ou JSONArray
     * @throws org.json.JSONException
     */
    private static void JSONExampleTokener() throws org.json.JSONException {

        //Instancia uma string com dados no formato JSON
        String string = "["+"true,"
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
        //Instancia um objeto JSONTokener respectivo a string com os dados no formato json passado como argumento
        JSONTokener token = new JSONTokener(string);

        //Converte os dados em JSON para um JSONObject
        JSONObject object = new JSONObject(token);
        //Converte os dados em JSON para um JSONArray
        JSONArray array = new JSONArray(token);

    }
}
