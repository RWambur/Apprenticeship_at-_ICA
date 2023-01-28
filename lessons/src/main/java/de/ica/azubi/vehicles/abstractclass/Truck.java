package de.ica.azubi.vehicles.abstractclass;

import de.ica.azubi.vehicles.VehicleType;

public class Truck extends AbstractVehicle {
    @Override
    protected VehicleType getVehicleType() {
        return VehicleType.TRUCK;
    }

    @Override
    protected double getMaxSpeed() {
        return 80;
    }

    @Override
    protected int getPassangerSeats() {
        return 3;
    }
}
