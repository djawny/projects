package sda.zadanie23_design_patterns.flyweight;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class PointFactory {
    static Set<Point> pointSet = new HashSet<>();

    public static Point create(int x, int y) {

        Optional<Point> first = pointSet.stream().filter(p -> p.x == x && p.y == y).findFirst();
        if (first.isPresent()) {
            return first.get();
        }
        Point point = new Point(x, y);
        pointSet.add(point);
        return point;
    }
}
