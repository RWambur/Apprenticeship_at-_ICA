package de.ica.azubi.vehicles.abstractclass;

import de.ica.azubi.vehicles.VehicleType;

public abstract class AbstractVehicle {
    protected double currentSpeed = 10;

    protected abstract VehicleType getVehicleType();

    protected abstract double getMaxSpeed();

    protected abstract int getPassangerSeats();

    public boolean doPassangersFit(int passangers) {
        return passangers <= getPassangerSeats();
    }

    public boolean accelerate(double addedAcceleration) {
        currentSpeed += addedAcceleration;
        return (currentSpeed <= getMaxSpeed());
    }

    public boolean decelerate(double removedAcceleration) {
        currentSpeed -= removedAcceleration;
        return (currentSpeed >= 0);
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }
}
