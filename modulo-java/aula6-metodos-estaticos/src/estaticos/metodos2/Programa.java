package estaticos.metodos2;

public class Programa {
    public static void main(String[] args) {
        System.out.println(Produto.resultado(10, 50));

        Produto prod = new Produto();
        System.out.println(prod.mudeNomeProduo("João"));
        System.out.println(Produto.pegarCpf("  990-202-202-101"));
    }
}
