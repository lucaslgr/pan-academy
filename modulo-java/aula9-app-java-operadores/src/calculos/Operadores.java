package calculos;

public class Operadores {
    public static void main(String[] args) {
        int a = 5;
        a += 3;
        System.out.println(a);

        int b = 5;
        b -= 3;
        System.out.println(b);

        int c = 5;
        c *= 3;
        System.out.println(c);

        int s = 5;
        int t = 3;
        System.out.println(s == t);
        System.out.println(s != t);
        System.out.println(s >= t);

        int x = 5;
        System.out.println("int x = 5");
        System.out.println("x < 3 && x == 5");
        System.out.println(x < 3 && x == 5);
        System.out.println("x < 3 || x == 5");
        System.out.println(x < 3 || x == 5);
        System.out.println("!(x < 3 && x > 60)");
        System.out.println(!(x > 3 && x < 10));

        int performace = 10;
        if (performace >= 9 && x < 10) {
            System.out.println("Ótimo player " + performace);
        } else if(performace >= 8 && x < 9){
            System.out.println("Mediano player " + performace);
        } else {
            System.out.println("Desqualificado");
        }
    }
}
