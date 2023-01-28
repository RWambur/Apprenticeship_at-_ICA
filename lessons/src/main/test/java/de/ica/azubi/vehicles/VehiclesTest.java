package de.ica.azubi.vehicles;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class VehiclesTest {
    private VehiclesLesson sut;

    @BeforeEach
    void setUp() {
        this.sut = new VehiclesLesson();
    }

    @Test
    void Bicycle_OnePassanger_ShouldReturnTrue() {
        VehicleType carType = VehicleType.BICYCLE;
        int passangers = 1;

        boolean result = sut.vehiclePassangers(carType, passangers);

        assertThat(result).isTrue();
    }

    @Test
    void Car_ThreePassanger_ShouldReturnFalse() {
        VehicleType carType = VehicleType.CAR;
        int passangers = 12;

        boolean result = sut.vehiclePassangers(carType, passangers);

        assertThat(result).isFalse();
    }

    @Test
    void Bicycle_AccelerationPossible() {
        VehicleType carType = VehicleType.BICYCLE;
        double addedAcceleration = 10;

        boolean result = sut.vehicleAcceleration(carType, addedAcceleration);

        assertThat(result).isTrue();
    }

    @Test
    void Car_AccelerationNotPossible() {
        VehicleType carType = VehicleType.CAR;
        double addedAcceleration = 200;

        boolean result = sut.vehicleAcceleration(carType, addedAcceleration);

        assertThat(result).isFalse();
    }

    @Test
    void Bicycle_DecelerationPossible() {
        VehicleType carType = VehicleType.BICYCLE;
        double removedAcceleration = 4;

        boolean result = sut.vehicleDeceleration(carType, removedAcceleration);

        assertThat(result).isTrue();
    }

    @Test
    void Car_DecelerationNotPossible() {
        VehicleType carType = VehicleType.CAR;
        double removedAcceleration = 50;

        boolean result = sut.vehicleDeceleration(carType, removedAcceleration);

        assertThat(result).isFalse();
    }
}