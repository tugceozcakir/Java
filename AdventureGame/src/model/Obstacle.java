package model;

import java.util.Random;

public abstract class Obstacle {
    private int id;
    private String name;
    private int damage;
    private int gold;
    private int remainingHealth;
    //THIS HEALTH VALUE WON'T CHANGE
    private int beginningHealth;

    public Obstacle(int id, String name, int damage, int health, int gold) {
        setId(id);
        setName(name);
        setDamage(damage);
        setRemainingHealth(health);
        setGold(gold);
        setBeginningHealth(health);
    }

    public int getBeginningHealth() {
        return beginningHealth;
    }

    public void setBeginningHealth(int beginningHealth){
        this.beginningHealth = beginningHealth;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        // If the incoming damage value is 0, a random value will be assigned (between 3 and 7)
        if (damage == 0) {
            // Random value between 3 and 7 (including 3, excluding 7)
            Random random = new Random();
            damage = random.nextInt(5) + 3;
        }
        this.damage = damage;
    }
    

    public int getRemainingHealth() {
        return remainingHealth;
    }

    public void setRemainingHealth(int remainingHealth) {
       if(remainingHealth < 0){
           remainingHealth = 0;
       }
        this.remainingHealth = remainingHealth;
    }
}