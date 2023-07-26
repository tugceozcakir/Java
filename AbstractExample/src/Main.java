import model.Car;
import model.Mercedes;
import model.Opel;
import service.CarService;
import service.interfaces.ICarService;

public class Main {
    public static void main(String[] args) {

        Opel opel = new Opel();
        opel.setBrand("Opel");
        opel.setColor("white");
        opel.setWeight(1000);
        opel.setHorsePower(100);
        opel.setModel("Corsa");
        opel.calculateZeroToHundredSpeedTime();

        int calculatedZeroToHundredSpeedTime = opel.calculateZeroToHundredSpeedTime();
        System.out.println(calculatedZeroToHundredSpeedTime);

        Car mercedes = new Mercedes();
        mercedes.setBrand("Mercedes");
        mercedes.setColor("black");
        mercedes.setWeight(1258);
        mercedes.setHorsePower(123);
        mercedes.setModel("E250");
        mercedes.calculateZeroToHundredSpeedTime();

        int calculatedZeroToHundredSpeedTimeForMercedes = mercedes.calculateZeroToHundredSpeedTime();
        System.out.println(calculatedZeroToHundredSpeedTimeForMercedes);

        CarService carService = new CarService();
        carService.oilUsage(mercedes);

        ICarService iCarService = new CarService();
        iCarService.horn();
        ICarService.horn2();
    }
}