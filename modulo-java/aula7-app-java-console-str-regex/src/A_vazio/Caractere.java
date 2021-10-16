package A_vazio;

public class Caractere {
    public static String metodoDigitado (String digitado) {
        if (digitado == null || digitado.isEmpty()) {
            System.out.println("Sem nada");
            return null;
        }
        else {
            digitado = digitado.replace("1", "a");
            return digitado;
        }
    }
}
