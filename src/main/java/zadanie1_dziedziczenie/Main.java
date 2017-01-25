package zadanie1_dziedziczenie;

public class Main {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle("", "", 2002);
        Vehicle car = new Car("Mondeo", "Ford", 2001);
        Vehicle truck = new Truck("XXX", "Scania", 2006);

        vehicle.drive();
        car.drive();
        truck.drive();

        Vehicle[] vehicles = new Vehicle[]{vehicle, car, truck};
        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].drive();
        }

    }

}
