package sda.zadanie6_przeslanianie;

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
