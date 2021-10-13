package VendoMetodoExterno;

import java.lang.reflect.Method;

public class Programa {
    public static void main(String[] args) {
        try{
            //Chama a classe e coloca ela no objeto
            Object objt = Class.forName("com.panacademy.pacote.Pessoa").newInstance();

            //Chama o método e coloca ela no metododinho
            Method metodo = objt.getClass().getDeclaredMethod("pegarNome", String.class);

            //Metodo pode ser visto
            metodo.setAccessible(true);

            String nome = (String) metodo.invoke(objt, "Lucas");
            System.out.println(nome);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
