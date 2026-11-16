package com.pluralsight;

public class SemiTruck extends Vehicle {
    private String load;
    private boolean trailerAttached;

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
