package com.pluralsight;

public class Car extends Vehicle {
    private String bodyStyle;
    private String vin;
    //private Trunk trunk;
    private boolean trunkOpen;

    public Car (String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, int speed, String bodyStyle, String vin, boolean trunkOpen) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity, speed);
        this.bodyStyle = bodyStyle;
        this.vin = vin;
        this.trunkOpen = trunkOpen;
    }

    public String getBodyStyle() {
        return bodyStyle;
    }

    public void setBodyStyle(String bodyStyle) {
        this.bodyStyle = bodyStyle;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public boolean getTrunkOpen() {
        return trunkOpen;
    }

    public void setTrunkOpen(boolean trunkOpen) {
        this.trunkOpen = trunkOpen;
    }

    public void openTrunk() {
        // open the trunk
    }
}
