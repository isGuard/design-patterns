package org.example.components;

import org.example.cars.Car;

/**
 * 产品特征 4
 *
 * @author Z
 * @version V1.0
 * @date 2024/9/13 上午11:48
 */
public class TripComputer {

    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    public void showFuelLevel() {
        System.out.println("Fuel level: " + car.getFuel());
    }

    public void showStatus() {
        if (this.car.getEngine().isStarted()) {
            System.out.println("Car is started");
        } else {
            System.out.println("Car isn't started");
        }
    }
}
