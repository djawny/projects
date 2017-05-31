package sda.zadanie23_design_patterns.factory;

import java.io.IOException;


public class CarMain {
    public static void main(String[] args) throws IOException {
        Car car;

        car = CarFactory.create("camaro");
        car.drive();

        car = CarFactory.create("mustang");
        car.drive();

        Car mustang = CarFactory.create("mustang");
        car = new RaceCar(mustang);
        System.out.println("----------");
        car.drive();
    }
}
