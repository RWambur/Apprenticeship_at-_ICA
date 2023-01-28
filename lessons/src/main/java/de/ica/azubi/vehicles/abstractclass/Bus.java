package de.ica.azubi.vehicles.abstractclass;

import de.ica.azubi.vehicles.VehicleType;

public class Bus extends AbstractVehicle {
    @Override
    protected VehicleType getVehicleType() {
        return VehicleType.BUS;
    }

    @Override
    protected double getMaxSpeed() {
        return 120;
    }

    @Override
    protected int getPassangerSeats() {
        return 69;
    }
}
