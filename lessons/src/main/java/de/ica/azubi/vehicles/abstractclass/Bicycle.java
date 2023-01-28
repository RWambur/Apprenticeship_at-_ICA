package de.ica.azubi.vehicles.abstractclass;

import de.ica.azubi.vehicles.VehicleType;

public class Bicycle extends AbstractVehicle {
    @Override
    protected VehicleType getVehicleType() {
        return VehicleType.BICYCLE;
    }

    @Override
    protected double getMaxSpeed() {
        return 25;
    }

    @Override
    protected int getPassangerSeats() {
        return 1;
    }
}
