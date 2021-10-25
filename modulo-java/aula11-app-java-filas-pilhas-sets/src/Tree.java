import java.util.Iterator;
import java.util.TreeSet;

public class Tree {
    public static void main(String[] args) {
        TreeSet<Integer> tree = new TreeSet<>();
        tree.add(12);
        tree.add(23);
        tree.add(30);
        tree.add(45);

        Iterator<Integer> iteratorTree = tree.iterator();
        while (iteratorTree.hasNext()){
            System.out.println(iteratorTree.next() + " ");
        }
    }
}
