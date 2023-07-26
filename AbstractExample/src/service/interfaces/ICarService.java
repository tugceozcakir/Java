package service.interfaces;

import model.Car;

public interface ICarService {

    default public void horn(){
        System.out.println("Düütt düüütttt");
    }
    public static void horn2(){
        System.out.println("Düüütttt");
    }
    public void speed(int x, double y);
    public void handBreak();
    public void engineSound();
    public void oilUsage(Car car);
}
