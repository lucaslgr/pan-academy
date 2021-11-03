public class Colaborador {
    public String nome;
    public String cpf;
    public double salario;

    public Colaborador(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public Colaborador(String nome, String cpf, int salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }
}
