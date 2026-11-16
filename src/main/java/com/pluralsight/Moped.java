package com.pluralsight;

public class Moped extends Vehicle{
    private boolean isKickstandDown;

    public Moped(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, int speed, boolean isKickstandDown) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity, speed);
        this.isKickstandDown = isKickstandDown;
    }

    public boolean isKickstandDown() {
        return isKickstandDown;
    }

    public void setKickstandDown(boolean kickstandDown) {
        isKickstandDown = kickstandDown;
    }

    public void lowerKickstand() {
        // lowerkickstand
    }

}
