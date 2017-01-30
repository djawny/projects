package sda.zadanie23_patterns;

import sda.zadanie0.przyklady.klas.Point;

public class PointFactory {
    public static Point create(int x, int y) {
        return new Point(x, y);
    }
}
