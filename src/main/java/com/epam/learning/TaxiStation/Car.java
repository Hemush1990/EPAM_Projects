package com.epam.learning.TaxiStation;

public abstract class Car implements Comparable<Car>{
    public abstract String name();
    public abstract int getPrice();
    public abstract int setFuelConsumption();
    public abstract int getMaxSpeed();
}
