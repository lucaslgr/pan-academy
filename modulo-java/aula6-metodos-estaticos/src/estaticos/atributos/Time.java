package estaticos.atributos;

public class Time {

    //Muitos atletas
    //Pertence ao objeto
    String atleta;

    //Um professor
    //Pertence a classe
    static String professor;

    //Atributos comuns não podem ser acessados em métodos estaticos
    static void treinar() {
        System.out.println(professor);
//        System.out.println(atleta);
    }
}
