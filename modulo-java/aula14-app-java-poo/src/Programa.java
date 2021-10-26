public class Programa {
    public static void fazerAnimalComer(Animal animal) {
        animal.comer();
    }

    public static void main(String[] args) {
        fazerAnimalComer(new Animal());
        fazerAnimalComer(new Cao());
        fazerAnimalComer(new Leao());
    }
}
