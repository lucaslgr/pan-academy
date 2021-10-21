import java.util.LinkedList;

public class LinkedContain {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<>();

        cars.add("EcoSport");
        cars.add("Mercedes>");
        cars.add("Fpx");
        cars.add("Gol");

        System.out.println(cars.contains("Gol"));
        cars.addFirst("Palio");
        cars.addLast("Mazda");
        cars.removeLast();
        System.out.println(cars.get(0));
        System.out.println(cars.getLast());
        cars.clear();

        LinkedList<String> list = new LinkedList<String>();
        list.add("Geeks");
        list.add("for");

        System.out.println("Does the List contains 'Geeks': " + list.contains("Geeks"));
    }
}
