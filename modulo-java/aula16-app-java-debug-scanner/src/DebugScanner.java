import java.util.Locale;
import java.util.Scanner;

public class DebugScanner {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Largura...");
        double largura = sc.nextDouble();
        System.out.println("Comprimento...");
        double comprimento = sc.nextDouble();
        System.out.println("Preco por metro...");
        double metroQuadrado = sc.nextDouble();

        //stop
        double area = largura * comprimento;
        double preco = area * metroQuadrado;
        System.out.printf("AREA = %.2f%", area);
        System.out.printf("PRECO = %.2f%n", +preco);
        sc.close();
    }
}
