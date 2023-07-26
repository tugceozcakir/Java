package model;

public class MarioBaseCharacter {
    private String name;
    private int health;
    private GrowthCycleEnum powers;
    private int length;
    private boolean immortality;
    private int remainingLife;
    private Coordinate coordinate;

    public MarioBaseCharacter(String name, int health, GrowthCycleEnum powers, int length, boolean immortality, int remainingLife, Coordinate coordinate) {
        this.name = name;
        this.health = health;
        this.powers = powers;
        this.length = length;
        this.immortality = immortality;
        this.remainingLife = remainingLife;
        this.coordinate = coordinate;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public GrowthCycleEnum getPowers() {
        return powers;
    }

    public void setPowers(GrowthCycleEnum powers) {
        this.powers = powers;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public boolean isImmortality() {
        return immortality;
    }

    public void setImmortality(boolean immortality) {
        this.immortality = immortality;
    }

    public int getRemainingLife() {
        return remainingLife;
    }

    public void setRemainingLife(int remainingLife) {
        this.remainingLife = remainingLife;
    }

    @Override
    public String toString() {
        return "MarioBaseCharacter{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", powers=" + powers +
                ", length=" + length +
                ", immortality=" + immortality +
                ", remainingLife=" + remainingLife +
                '}';
    }
}
