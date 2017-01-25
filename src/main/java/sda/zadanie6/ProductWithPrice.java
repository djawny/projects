package sda.zadanie6;

public class ProductWithPrice extends Product {
    private double price=0.0;

    public ProductWithPrice(String name, double price) {
        super(name);
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
