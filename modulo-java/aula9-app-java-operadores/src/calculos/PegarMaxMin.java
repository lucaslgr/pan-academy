package calculos;

public class PegarMaxMin {

    public static void main(String[] args) {

        //Aquecimento 1
        System.out.println("Máximo: " + Math.max(5,10));
        System.out.println("Máximo: " + Math.min(5,10));

        //Ceil arredonnda para cima
        //Arredonda para baixo
        double a = 3.5;
        System.out.println("Ceil arr. para cima: " + Math.ceil(a));
        System.out.println("Ceil arr. para baixo: " + Math.floor(a));

        //Inicia um array
        int[] arr = {4, 2, 5, 3, 6};

        //Inicia com zero
        int max = arr[0];

        //for
        for (int i = 1; i < arr.length; i ++) {
            max = Math.max(max, arr[i]);
        }

        System.out.println("Máximo: " + max);
    }
}
