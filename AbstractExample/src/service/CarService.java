package service;

import model.Car;
import service.interfaces.ICarService;
import service.interfaces.ITrafficFee;

public class CarService implements ICarService, ITrafficFee {
    @Override
    public void speed(int x, double y) {

    }

    @Override
    public void handBreak() {

    }

    @Override
    public void engineSound() {

    }

    @Override
    public void oilUsage(Car car) {
        System.out.println(car.getColor());

    }

    @Override
    public void speedFee() {

    }

    @Override
    public void redLightFee() {

    }
}
