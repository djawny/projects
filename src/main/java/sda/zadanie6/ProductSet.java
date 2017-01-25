package sda.zadanie6;

import java.util.ArrayList;
import java.util.List;

public class ProductSet {

    private List<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    public void show() {
        for (Product product : products) {
            System.out.println(product.getName());
            try {
                System.out.println(((ProductWithPrice) product).getPrice());
            } catch (Exception e) {
                System.out.println("Brak ceny");
            }

        }
    }
}
