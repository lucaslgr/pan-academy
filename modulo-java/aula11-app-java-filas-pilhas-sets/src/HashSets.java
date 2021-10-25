import java.util.HashSet;
import java.util.Iterator;

public class HashSets {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<>();
        cars.add("Gol");
        cars.add("Fox");
        cars.add("Gol");
        cars.add("BMW");
        cars.add("Eco");

        for (String i: cars) {
            System.out.println(i);
        }

        System.out.println();
        for (String i : cars) {
            if(i.contains("co")){
                System.out.println(i);
            }
        }

        Iterator<String> iteratorHashSet = cars.iterator();
        while(iteratorHashSet.hasNext()) {
            System.out.println(iteratorHashSet.next() + " ");
        }
    }
}
