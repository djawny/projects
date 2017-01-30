package sda.zadanie23_patterns;

/*
Patterns:
Creational:
- factory pattern
- abstract factory
- singleton
- factory
Structural:
- decorator
- flyweight
- adapter
Behavioral:
- strategy
- null object
- observer
*/

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car.Builder("123").withBrand("Opel").withModel("Vectra").build();
    }
}
