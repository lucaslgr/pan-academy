import java.util.Stack;

public class Pilha {
    public static void main(String[] args) {
        Stack<Integer> pilha = new Stack<>();

        boolean result = pilha.empty();

        System.out.println("A pilha está vazia?? " + result);

        pilha.push(68);
        pilha.push(118);
        pilha.push(90);
        pilha.push(720);
        pilha.push(10);
        pilha.pop();

        System.out.println("Elementos do meu stack: " + pilha);
        result = pilha.empty();
        System.out.println("Está vazio?? " + result);
    }
}
