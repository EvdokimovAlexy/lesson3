package ru.geekbrains.lesson3;

import java.awt.Color;

/**
 * Класс описывает электрический автомобиль
 */
public class ElectroCar extends Car {

    public ElectroCar(String make, String model, Color color, FuelType fuelType) {
        super(make, model, color, fuelType);
        setWheelsCount(4);
    }

    /** Метод езды автомобиля */
    public void fly() {
        System.out.println("Автомобиль движится!");
    }

    @Override
    public void movement() {
        electro();
    }

    @Override
    public void maintenance() {

    }

    @Override
    public boolean gearShifting() {
        return false;
    }

    @Override
    public boolean switchHeadLights() {
        return false;
    }

    @Override
    public boolean swithWipers() {
        return false;
    }

}