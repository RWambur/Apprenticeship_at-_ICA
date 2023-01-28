package de.ica.azubi.vehicles.abstractclass;

import de.ica.azubi.vehicles.VehicleType;

public class Garage {
    public AbstractVehicle getVehicle(VehicleType vehicleType) {
        return switch (vehicleType) {
            case BICYCLE -> new Bicycle();
            case MOTORCYCLE -> new Motorcycle();
            case CAR -> new Car();
            case TRUCK -> new Truck();
            case BUS -> new Bus();
        };
    }
}
