package com.pluralsight;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Moped moped = new Moped("Blue", 10, 9, 2, 0, true);

        Car car = new Car();
        car.setBodyStyle("Sedan");
        car.setTrunkOpen(false);
        car.setVin("10223525h");
        car.setCargoCapacity(35);
        car.setColor("Black");
        car.setFuelCapacity(13);
        car.setNumberOfPassengers(5);

        SemiTruck semiTruck = new SemiTruck();
        semiTruck.setLoad("Stones");
        semiTruck.setTrailerAttached(true);
        semiTruck.setCargoCapacity(5000);
        semiTruck.setColor("Burgundy");
        semiTruck.setFuelCapacity(2000);
        semiTruck.setNumberOfPassengers(2);

        Hovercraft hovercraft = new Hovercraft();
        hovercraft.setSkirtInflated(true);
        hovercraft.setCargoCapacity(15);
        hovercraft.setColor("Gray and Green");
        hovercraft.setFuelCapacity(50);
        hovercraft.setNumberOfPassengers(8);

        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(moped);
        vehicles.add(car);
        vehicles.add(semiTruck);
        vehicles.add(hovercraft);

        for (Vehicle vehicle : vehicles) {
            System.out.println("Vehicle: " + vehicle.getColor());
        }

        System.out.println("Why are you able to access the Vehicle getters/setters when you did not create an 'instance' of the Vehicle class?");
        System.out.println("Each vehicle type has its own class which 'extends' the vehicle class. This means each can access the vehicle class.");

    }
}
