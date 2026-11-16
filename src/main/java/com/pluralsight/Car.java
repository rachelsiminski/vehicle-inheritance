package com.pluralsight;

public class Car extends Vehicle {
    private String bodyStyle;
    private String vin;
    //private Trunk trunk;
    private boolean trunkOpen;



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
