package zadanie1_dziedziczenie;

public class Vehicle {
    private String model;
    private String make;
    private int productionYear;

    public Vehicle() {
    }

    public Vehicle(String model, String make, int productionYear) {
        this.model = model;
        this.make = make;
        this.productionYear = productionYear;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public void drive(){
        System.out.println("Predkosc maks 1000km/h");
    }
}
