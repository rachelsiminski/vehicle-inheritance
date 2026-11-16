package com.pluralsight;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Moped moped = new Moped("Blue", 10, 9, 2, 0, true);

        Car car = new Car("Black", 5, 35, 13, 0, "Sedan", "2346234678234678", false);

        SemiTruck semiTruck = new SemiTruck("Burgundy",2, 5000, 2000, 0, "Stones and Bricks", true);

        Hovercraft hovercraft = new Hovercraft("Gray and green", 8,35, 50, 0, false);

        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(moped);
        vehicles.add(car);
        vehicles.add(semiTruck);
        vehicles.add(hovercraft);

        for (Vehicle vehicle : vehicles) {
            System.out.println("Vehicle: " + vehicle.getColor());
        }
        System.out.println();

        System.out.println("Why are you able to access the Vehicle getters/setters when you did not create an 'instance' of the Vehicle class?");
        System.out.println("Each vehicle type has its own class which 'extends' the vehicle class. This means each can access the vehicle class.");

    }
}
