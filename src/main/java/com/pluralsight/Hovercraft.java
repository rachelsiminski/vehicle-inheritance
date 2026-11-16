package com.pluralsight;

public class Hovercraft extends Vehicle{
    private boolean isSkirtInflated;

    public Hovercraft(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, int speed, boolean isSkirtInflated) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity, speed);
        this.isSkirtInflated = isSkirtInflated;
    }

    public boolean isSkirtInflated() {
        return isSkirtInflated;
    }

    public void setSkirtInflated(boolean skirtInflated) {
        isSkirtInflated = skirtInflated;
    }

    public void inflateSkirt() {
        // inflate the skirt
    }
}
