import java.util.Scanner;

public class LerScanner {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); //Create a Scanner object
        System.out.println("Enter usernome");

        String userName = myObj.nextLine(); // Read user input
        System.out.println("Usernome is: " + userName); // Output user input

        System.out.println("Integer");
        Integer idade = myObj.nextInt();
        System.out.println("Idade lida: " + idade);

        System.out.println("Short");
        Short peso = myObj.nextShort();
        System.out.println("Idade lida: " + peso);

        System.out.println("Long");
        Long altura = myObj.nextLong();
        System.out.println("Idade lida: " + altura);
    }
}
