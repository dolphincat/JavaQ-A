package com.dorrypractice;

/**
 * Created by dolphincat_yue on 3/7/17.
 */
public class Car1 extends Vehicle1 {

    private int weels;
    private int doors;
    private int gears;
    private boolean isManual;

    private int currentGear;



    public Car1(String name, String size, int weels, int doors, int gears, boolean isManual, int currentGear) {
        super(name, size);
        this.weels = weels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }


    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car1. setCurrentGear(): Change to "+this.currentGear+ " gear");
    }

   //change the velocity of the vehicle
    public void changeVelocity(int speed, int direction){
        move(speed, direction);
        System.out.println("Car.changeVelocity(): Velocity "+speed+" direction "+direction);
    }

    //the next class we can add override to the stop class for the vehicle1 class






}
