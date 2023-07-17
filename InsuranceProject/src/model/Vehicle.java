package model;

import model.Accident;
import model.ColorTypeEnum;

import java.util.ArrayList;

public class Vehicle {
    private String model;
    private String plate;
    private String chassisNumber;
    private String brand;
    private int modelYear;
    private ArrayList<Accident> accidentList;
    private ColorTypeEnum colorTypeEnum;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getChassisNumber() {
        return chassisNumber;
    }

    public void setChassisNumber(String chassisNumber) {
        this.chassisNumber = chassisNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public ArrayList<Accident> getAccidentList() {
        return accidentList;
    }

    public void setAccidentList(ArrayList<Accident> accidentList) {
        this.accidentList = accidentList;
    }

    public ColorTypeEnum getColorTypeEnum() {
        return colorTypeEnum;
    }

    public void setColorTypeEnum(ColorTypeEnum colorTypeEnum) {
        this.colorTypeEnum = colorTypeEnum;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", plate='" + plate + '\'' +
                ", chassisNumber='" + chassisNumber + '\'' +
                ", brand='" + brand + '\'' +
                ", modelYear=" + modelYear +
                ", accidentList=" + accidentList +
                ", colorTypeEnum=" + colorTypeEnum +
                '}';
    }
}
