package de.ica.azubi.vehicles;

import de.ica.azubi.vehicles.abstractclass.AbstractVehicle;
import de.ica.azubi.vehicles.abstractclass.Garage;

public class VehiclesLesson {
    Garage garage = new Garage();

    public boolean vehiclePassangers(VehicleType vehiclesType, int value) {
        AbstractVehicle vehicle = garage.getVehicle(vehiclesType);
        return vehicle.doPassangersFit(value);
    }

    public boolean vehicleAcceleration(VehicleType vehiclesType, double addedAcceleration) {
        AbstractVehicle vehicle = garage.getVehicle(vehiclesType);
        return vehicle.accelerate(addedAcceleration);
    }

    public boolean vehicleDeceleration(VehicleType vehiclesType, double removedAcceleration) {
        AbstractVehicle vehicle = garage.getVehicle(vehiclesType);
        return vehicle.decelerate(removedAcceleration);
    }
}
