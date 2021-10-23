import javax.swing.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Leitura {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Calculando parcelas");
        double valorTotal = Double.parseDouble((JOptionPane.showInputDialog("Qual é o valor do produto")));
        int numParcelas = Integer.parseInt(JOptionPane.showInputDialog("Em quantas parcelas?"));
        double valorParcela = valorTotal / numParcelas;
        NumberFormat format = new DecimalFormat("R$ ###,##0.00");
        JOptionPane.showMessageDialog(null, "O valor de cada Parcela é: " + format.format(valorParcela));
    }
}
