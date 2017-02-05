package sda.zadanie23_design_patterns.adapter;

public class ShapeMain {
    public static void main(String[] args) {
        Shape shape = new ShapeAdapter(new Line());
        shape.draw(0, 0, 1, 1);
        shape = new ShapeAdapter(new Rectangle());
        shape.draw(0, 0, 1, 1);
    }
}
