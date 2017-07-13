package com.dorrypractice;

/**
 * Created by dolphincat_yue on 3/7/17.
 */
public class Vehicle1 {

    private String name;
    private String size;
    private int currentVelocity;
    private int currentDirection;

    public Vehicle1(String name, String size) {
        this.name = name;
        this.size = size;

        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    public void steer(int direction){
        this.currentDirection +=direction;
        System.out.println("Vehicle.steer(): Steering at "+currentDirection+" degrees");
    }

    public void move (int velocity, int direction){
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.println("Vehicle.move(): Moving at "+currentVelocity+" speed");
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void stop(){
        this.currentVelocity = 0;
        //purely stop the vehicle, nothing to do with the direction

    }
}
