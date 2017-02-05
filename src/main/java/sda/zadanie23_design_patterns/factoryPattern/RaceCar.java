package sda.zadanie23_design_patterns.factoryPattern;

class RaceCar implements Car {
    private Car car;

    public RaceCar(Car car) {
        this.car = car;
    }

    @Override
    public void drive() {
        System.out.println("Launching start procedure");
        car.drive();
    }
}
