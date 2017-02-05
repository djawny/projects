package sda.zadanie23_design_patterns.factoryPattern;

public class CarFactory {
    public static Car create(String type) {
        if (type.equals("mustang")) {
            return new MustangGTI();
        } else if (type.equals("camaro")) {
            return new CamaroSS();
        }
        return null;
    }
}
