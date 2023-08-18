package Entities;

import Enum.VehicleType;
public class Vehicle {

    private String brand;
    private String model;
    private String year;
    private long engineNumber;
    private String chassis;
    private String color;
    private VehicleType type;

    public Vehicle() {
    }

    public Vehicle(String brand, String model, String year, long engineNumber, String chassis, String color, VehicleType type) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.engineNumber = engineNumber;
        this.chassis = chassis;
        this.color = color;
        this.type = type;
    }

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

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public long getEngineNumber() {
        return engineNumber;
    }

    public void setEngineNumber(long engineNumber) {
        this.engineNumber = engineNumber;
    }

    public String getChassis() {
        return chassis;
    }

    public void setChassis(String chassis) {
        this.chassis = chassis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }
}
