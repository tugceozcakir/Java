package model;

public abstract class Car {
    private String brand;
    private String model;
    private String color;
    private String plate;
    private int zeroToHundredSpeedTime;
    private int horsePower;
    private int weight;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public int getZeroToHundredSpeedTime() {
        return zeroToHundredSpeedTime;
    }

    public void setZeroToHundredSpeedTime(int zeroToHundredSpeedTime) {
        this.zeroToHundredSpeedTime = zeroToHundredSpeedTime;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void carBrand(){
        System.out.println("car brand");
    }
    public abstract void carColor();
    public  abstract int calculateZeroToHundredSpeedTime();
}
