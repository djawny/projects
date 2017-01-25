package zadanie1_dziedziczenie;

public class Car extends Vehicle {

    public Car() {
    }

    public Car(String model, String make, int productionYear) {
        super(model, make, productionYear);
    }

    @Override
    public void drive() {
        System.out.println("Predkosc maks 330km/h");
    }
}
