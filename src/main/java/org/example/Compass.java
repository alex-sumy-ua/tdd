package org.example;

public class Compass {

    public enum Point{
        NORTH,
        EAST,
        SOUTH,
        WEST,
    }

    public enum Direction{
        RIGHT,
        LEFT,
    }

    private Point point;

    public Point rotate(Point point, Direction direction) {
        if (point == Point.EAST && direction == Direction.RIGHT) return Point.NORTH;
        return null;
    }

}
