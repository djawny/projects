package sda.sdajava.przyklady.klas;


public class Point {

    double x;
    double y;

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

    public double odleglosc(Point point2) {
        double x1 = x;
        double y1 = y;
        double x2 = point2.x;
        double y2 = point2.y;

        return Math.sqrt(Math.pow(x2 - x1, 2)
                + Math.pow(y2 - y1, 2));
    }
}
