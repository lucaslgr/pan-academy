package VendoMetodoExterno;

public class Pessoa {
    private String nome = "Guimarães";

    private String pegarNome(String visitanteNome) {
        System.out.println("Quem é ?..." + visitanteNome);
        return nome;
    }
}
