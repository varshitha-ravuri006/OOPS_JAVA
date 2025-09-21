package demo;

public class Product {
    private String name;
    private double price;

    public Product() {
        this.name = "Sample Product";
        this.price = 19.99;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void showDetails() {
        System.out.println("Product{name='" + name + "', price=" + price + "}");
    }
}
