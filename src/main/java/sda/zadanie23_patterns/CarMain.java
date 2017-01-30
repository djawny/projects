package sda.zadanie23_patterns;

//https://mvnrepository.com/
//https://technologyconversations.com/2014/11/04/java-8-streams-micro-katas/
//http://winterbe.com/posts/2014/07/31/java8-stream-tutorial-examples/
//http://ggoralski.pl/
//https://market.mashape.com/undefined
//http://start.spring.io/

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
