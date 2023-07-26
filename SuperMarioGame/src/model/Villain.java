package model;

public class Villain {
    private String name;
    private int damage;
    private boolean isMortal;
    private MoveTypeEnum moveTypeEnum;
    private Coordinate coordinate;
    private int health;

    public Villain(String name, int damage, boolean isMortal, MoveTypeEnum moveTypeEnum, Coordinate coordinate, int health) {
        this.name = name;
        this.damage = damage;
        this.isMortal = isMortal;
        this.moveTypeEnum = moveTypeEnum;
        this.coordinate = coordinate;
        this.health = health;
    }
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public MoveTypeEnum getMoveTypeEnum() {
        return moveTypeEnum;
    }

    public void setMoveTypeEnum(MoveTypeEnum moveTypeEnum) {
        this.moveTypeEnum = moveTypeEnum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public boolean isMortal() {
        return isMortal;
    }

    public void setMortal(boolean mortal) {
        isMortal = mortal;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }
}
