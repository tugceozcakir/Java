package model;

import model.Car;

public class Mercedes extends Car {
    @Override
    public void carColor() {
        System.out.println("Mercedes color");
    }

    @Override
    public int calculateZeroToHundredSpeedTime() {
        return getHorsePower() * getWeight() / 1000;
    }
}
