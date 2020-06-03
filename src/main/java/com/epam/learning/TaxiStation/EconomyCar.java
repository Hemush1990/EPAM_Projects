package com.epam.learning.TaxiStation;

public class EconomyCar extends Car {
    public String name;
    private int price;
    private int fuelConsumption;
    private int maxSpeed;

    public EconomyCar(String name, int price, int fuelConsumption, int maxSpeed) {
        this.name = name;
        this.price = price;
        this.fuelConsumption = fuelConsumption;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String name() {
        return ("It is Economy class");
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public int setFuelConsumption() {
        return fuelConsumption;
    }

    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public int compareTo(Car car) {
        return this.fuelConsumption - car.setFuelConsumption();
    }

    @Override
    public String toString() {
        return "EconomyCar{" +
                "price=" + price +
                ", fuelConsumption=" + fuelConsumption +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}




