package com.dorrypractice;

/**
 * Created by dolphincat_yue on 3/8/17.
 */
public class Furniture {

    private String material;
    private String color;
    private String years;
    private String brand;
    private String type;
    private boolean isBed;

    /*private int desk;
    private int bed;
    private int sofa; <-- this are actually the child class */

    public Furniture(String material, String color, String years, String brand, String type, boolean isBed) {
        this.material = material;
        this.color = color;
        this.years = years;
        this.brand = brand;
        this.type = type;
        this.isBed = isBed;
    }

    public void changeColor(String newcolor){
        if (color.equals(newcolor)){
            System.out.println("Nothing is changed");
        }else{
            color = newcolor;
            System.out.println("Color has been changed to "+color);
        }
    }

    public String getMaterial() {
        return material;
    }


    public String getYears() {
        return years;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public boolean isBed() {
        return isBed;
    }
}
