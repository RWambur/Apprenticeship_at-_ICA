package de.ica.azubi.vehicles.abstractclass;

import de.ica.azubi.vehicles.VehicleType;

public class Motorcycle extends AbstractVehicle {
    @Override
    protected VehicleType getVehicleType() {
        return VehicleType.MOTORCYCLE;
    }

    @Override
    protected double getMaxSpeed() {
        return 170;
    }

    @Override
    protected int getPassangerSeats() {
        return 2;
    }
}
