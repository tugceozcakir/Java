package model;

public class Mario extends MarioBaseCharacter{
    public Mario(String name, int health, GrowthCycleEnum powers, int length, boolean immortality, int remainingLife, Coordinate coordinate) {
        super(name, health, powers, length, immortality, remainingLife, coordinate);
    }
}
