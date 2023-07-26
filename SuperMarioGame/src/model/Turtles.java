package model;

public class Turtles extends MarioBaseCharacter{

    public Turtles(String name, int health, GrowthCycleEnum powers, int length, boolean immortality, int remainingLife, Coordinate coordinate) {
        super(name, health, powers, length, immortality, remainingLife, coordinate);
    }
}
