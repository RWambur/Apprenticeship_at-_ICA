package de.ica.azubi.vehicles.abstractclass;

import de.ica.azubi.vehicles.VehicleType;

public class Car extends AbstractVehicle {
    @Override
    protected VehicleType getVehicleType() {
        return VehicleType.CAR;
    }

    @Override
    protected double getMaxSpeed() {
        return 190;
    }

    @Override
    protected int getPassangerSeats() {
        return 5;
    }
}
