package com.dorrypractice;

public class Main {

    public static void main(String[] args) {
	// create an object
        Car porsche = new Car(); //when creating a new object, make sure to initiate it;
        Car holden = new Car();

        porsche.setModel("Carrera");
        System.out.println("Model is "+porsche.getModel());

    }
}
