import java.text.*;

public class Livro extends Produto{
    public void exibirDados() {
        System.out.println("Código: "+this.getCodigo() +
                "\nDescrição: " + this.getDescricao() +
                "\nPreço: " + formatarPreco(this.getPreco())
        );
    }

    private String formatarPreco(double preco) {
        NumberFormat format = new DecimalFormat("R$ ###,##0.00");
        return format.format(preco);
    }
}
