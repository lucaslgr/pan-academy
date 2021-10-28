package parte1;

public class Product {
    public String name;
    public double price;
    public int quantity;

    // Metodo to String que organiza o codigo, não precisa ser invocados
    public String toString() {
        return name + ", $" + price + ", " + quantity;
    }
}

