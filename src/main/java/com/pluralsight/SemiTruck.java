package com.pluralsight;

public class SemiTruck extends Vehicle {
    private String load;
    private boolean trailerAttached;

    public SemiTruck(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, int speed, String load, boolean trailerAttached) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity, speed);
        this.load = load;
        this.trailerAttached = trailerAttached;
    }

    public String getLoad() {
        return load;
    }

    public void setLoad(String load) {
        this.load = load;
    }

    public boolean isTrailerAttached() {
        return trailerAttached;
    }

    public void setTrailerAttached(boolean trailerAttached) {
        this.trailerAttached = trailerAttached;
    }

    public void attachTrailer() {
        // Attach trailer
    }
}
