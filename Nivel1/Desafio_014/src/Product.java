// java
// src/Product.java
import java.util.Scanner;

public class Product {
    private Double price;
    private String name;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public Product() {
    }

    public Product(Double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void sale(Scanner sc) {
        System.out.print("What did you sell: ");
        setName(sc.nextLine());
        System.out.print("It was how much: ");
        setPrice(sc.nextDouble());
        sc.nextLine(); // consome o newline pendente
    }
}
