package model;

import model.Car;

public class Opel extends Car {

    @Override
    public void carColor() {
        System.out.println("Opel color");
    }

    @Override
    public int calculateZeroToHundredSpeedTime() {
        return getHorsePower() * getWeight() / 1000;
    }

}
