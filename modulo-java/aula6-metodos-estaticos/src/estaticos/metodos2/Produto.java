package estaticos.metodos2;

public class Produto {

    //Não precisa inicializar, vantagem: Não precisa instanciar quando usar
    public static int resultado(int arroz, int feijao) {
        return (arroz + feijao);
    }

    //Tem que tornar estatico para não instanciar
    public String mudeNomeProduo(String nomeProd) {
        return nomeProd;
    }

    //Tratado
    public static String pegarCpf(String cpf) {
        String cpfTratado = cpf.strip();
        return cpfTratado;
    }
}
