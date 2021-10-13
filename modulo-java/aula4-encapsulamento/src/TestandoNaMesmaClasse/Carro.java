package TestandoNaMesmaClasse;

public class Carro {

    private String nome;

    private setNome(nome) {
        this.nome = nome;
    }

    private void exibeVelocidade() {
        System.out.println("A velocidade de um(a)" + nome + " é de 380km");
    }
}

public static void main(String[] args) {
    Carro c = new Carro();
    c.setNome("Ferrari");
    c.exibeVelocidade();
}