package sda.zadanie6;

public class Main {
    public static void main(String[] args) {

        ProductSet productSet = new ProductSet();
        productSet.add(new Product("My product1"));
        productSet.add(new ProductWithPrice("My product2",66));
        productSet.add(new ProductWithPrice("My product3",100));
        productSet.show();

    }
}
