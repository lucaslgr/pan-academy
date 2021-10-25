import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class PilhasIteracao {

    public static void main(String[] args) {
        Stack<Integer> pilhaList = new Stack<>();
        pilhaList.push(68);
        pilhaList.push(168);
        pilhaList.push(90);
        pilhaList.push(129);
        pilhaList.pop();

        ArrayList<String> listArray = new ArrayList<>();
        listArray.add("ArrayList 1");
        listArray.add("ArrayList 2");

        List<String> listList = new ArrayList<>();
        listList.add("Lista 1");
        listList.add("Lista 2");

        System.out.println("Iterar lista");
        Iterator<String> iteratorList = listList.iterator();
        while(iteratorList.hasNext()) {
            String iterado = iteratorList.next();
            System.out.println(iterado);
        }

        System.out.println("Iterar array");
        Iterator<String> iteratorArray = listArray.iterator();
        while(iteratorArray.hasNext()){
            String iterado = iteratorArray.next();
            System.out.println(iterado);
        }

        System.out.println("Iterar pilha");
        Iterator<Integer> iteratorPilha = pilhaList.iterator();
        while(iteratorPilha.hasNext()){
            Integer iterado = iteratorPilha.next();
            System.out.println(iterado);
        }
    }
}
