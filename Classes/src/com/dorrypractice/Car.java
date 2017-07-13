package com.dorrypractice;

/**
 * Created by dolphincat_yue on 3/7/17.
 */
public class Car {

    //create fields using private so others can't access this variables
    //if they are not in the Car class
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    //create a method <--this could be publicly accessible
    public void setModel(String model) {
        String validmodel = model.toLowerCase();
        if (validmodel.equals("porsha") || validmodel.equals("Kia")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    public String getModel() {
        return this.model;
    }

}



/*
public
private
protected
...
classes
 */
