package sda.zadanie4_przeslanianie_kolekcje_zbiory_listy_mapy_wyjatki;

public class Point {
    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Punkt o wspolrzednych x=" + x + " y=" + y;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Point) {
            Point point = (Point) obj;
            return x == point.x && y == point.y;
        } else {
            return false;
        }

    }

}
