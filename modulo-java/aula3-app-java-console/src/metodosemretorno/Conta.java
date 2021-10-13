package metodosemretorno;

public class Conta {
    int numeroConta;
    String titular;
    double saldo;

    public void sacar(double valor) {
        saldo -= saldo - valor;
        //ou saldo -= valor
    }

    public void depositar(double valor) {
        saldo = saldo + valor;
        //ou saldo += valor
    }
}
