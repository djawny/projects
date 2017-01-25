package zadanie1_dziedziczenie;

public class Truck extends Vehicle {

    public Truck() {
    }

    public Truck(String model, String make, int productionYear) {
        super(model, make, productionYear);
    }

    @Override
    public void drive() {
        System.out.println("Predkosc maks 100km/h");
    }
}
