package com.dorrypractice;

/**
 * Created by dolphincat_yue on 3/7/17.
 */
public class Dog extends Animal{
//add additional fields to expand the class;
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;


    public Dog(String name, int body, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, body, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    //add additional method to present dog
    private void chew(){
        System.out.println("Dog.chew() called");
    }

    //using inheritance and override inheritance
    public void eat(){
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }

    public void walk(){
        System.out.println("Dog.walk() called");
        move(5); //it's better to use this, because if you want to override the super class this walks better;
        super.move(5);
    }
    public void run(){
        System.out.println("Dog.run() called");
        move(10); //find in the current class first, if not available will do the super case
    }

    public void moveLegs(int speed){
        System.out.println("Dog.moveLegs() called");
    }
    @Override
    public void move(int speed){
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }
}
