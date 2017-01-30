package sda.zadanie23_factorypatterns_designpatterns_singleton_builder;

/*Patterns
creational
-factory pattern
-abstract factory
-singleton
-factory
structual
-decorator
-flyweight
-adapter
behavioral
-
-
-
*/
public class CarMain {
    public static void main(String[] args) {
        Car car = new Car.Builder("123").withBrand("Opel").withModel("Vectra").build();





    }
}
