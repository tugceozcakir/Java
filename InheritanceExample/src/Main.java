public class Main {
    public static void main(String[] args) {

        Engine engine = new Engine(5000, 350, FuelType.OIL);
        Ferrari ferrari = new Ferrari(engine);
        ferrari.setAutomatic(true);
        ferrari.setColor(ColorType.WHITE);
        ferrari.setModel("Ferrari");
        ferrari.setCaseType(CaseType.HASHBACK);
        ferrari.setFromZeroToHundredSec(3);
        ferrari.setSpeed(0);
        ferrari.setMaxSpeed(250);

        ferrari.useGas();
        System.out.println(ferrari);
        ferrari.useGas();
        System.out.println(ferrari);
        ferrari.useBreak();
        System.out.println(ferrari);


        Engine engine2 = new Engine(4000, 300, FuelType.OIL);
        Porsche porsche = new Porsche(engine2);
        porsche.setAutomatic(true);
        porsche.setColor(ColorType.WHITE);
        porsche.setModel("Porsche");
        porsche.setCaseType(CaseType.HASHBACK);
        porsche.setFromZeroToHundredSec(4);
        porsche.setSpeed(0);
        porsche.setMaxSpeed(220);


        porsche.useGas();
        System.out.println(porsche);
        porsche.useGas();
        System.out.println(porsche);
        porsche.useBreak();
        System.out.println(porsche);

        ferrari.useGasAccordingToHorsePower();
        System.out.println(ferrari.getSpeed());
        ferrari.useBreak();
        ferrari.useGas();
        System.out.println(ferrari.getSpeed());







    }
}