public class Programa {

    static int somando(int x, int y) {
        return x + y;
    }

    static double somando(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        int myNumber1 = somando(3,5);
        double myNumber2 = somando(3.1,3.5);
        System.out.println("Int: " + myNumber1);
        System.out.println("Double: " + myNumber2);

        Colaborador colaborador1 = new Colaborador("lucas", "123", 20.5);
        Colaborador colaborador2 = new Colaborador("lucas", "123", 20);
    }
}
