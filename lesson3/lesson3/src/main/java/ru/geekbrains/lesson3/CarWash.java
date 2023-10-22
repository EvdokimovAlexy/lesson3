package ru.geekbrains.lesson3;

/**
 * Класс описывает мойку автомобиля
 */
public class CarWash implements Wiping {

    @Override
    public void wipMirrors() {
        System.out.println("Помыли зеркало");
    }

    @Override
    public void wipWindshield() {
        System.out.println("Помыли стекла");
    }

    @Override
    public void wipHeadLights() {
        System.out.println("Помыли фары");
    }

}