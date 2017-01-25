package zadanie6;

public class Product {
    private String name;

    public Product(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println(name);
    }

    public String getName() {
        return name;
    }
}
