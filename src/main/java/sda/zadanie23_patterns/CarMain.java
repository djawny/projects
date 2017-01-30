package sda.zadanie23_patterns;

/*Patterns
creational
- factory pattern
- abstract factory
- singleton
- factory
structual
- decorator
- flyweight
- adapter
behavioral
- strategy
-
-
*/
public class CarMain {
    public static void main(String[] args) {
        Car car = new Car.Builder("123").withBrand("Opel").withModel("Vectra").build();





    }
}
