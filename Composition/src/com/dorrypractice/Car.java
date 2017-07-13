package com.dorrypractice;

/**
 * Created by dolphincat_yue on 3/8/17.
 */
public class Car extends Vehicle{

    private int doors;
    private int engineCapacity;

    public Car(String name, int doors, int engineCapacity) {
        super(name);
        this.doors = doors;
        this.engineCapacity = engineCapacity;
    }
}
