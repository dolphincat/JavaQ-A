package com.dorrypractice;

/**
 * Created by dolphincat_yue on 3/7/17.
 */
public class vehicle {

    private int doors;
    private int miles;
    private double price;
    private String name;
    private int speed;
    private String color;

    public vehicle(int doors, int miles, double price, String name, int speed, String color) {
        this.doors = doors;
        this.miles = miles;
        this.price = price;
        this.name = name;
        this.speed = speed;
        this.color = color;
    }

    public void handSteering(){
        System.out.println("vehicle.handSteering() called");
    }

    public void changeGears(){
        System.out.println("vehicle.changeGears() called");
    }

    public void move(int speed){
        System.out.println("vehicle.move() called");
        this.speed = speed;
    }

    public int getDoors() {
        return doors;
    }

    public int getMiles() {
        return miles;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }
    public String getColor(){
        return color;
    }
}
