package com.dorrypractice;

/**
 * Created by dolphincat_yue on 3/8/17.
 */
public class Bathroom {

    private int towels;
    private String color;
    private Furniture bathfurniture;

    public Bathroom(int towels, String color, Furniture bathfurniture) {
        this.towels = towels;
        this.color = color;
        this.bathfurniture = bathfurniture;
    }

    public void removeTowels(int remove){
        if (towels >= remove) {
            int leftover = towels - remove;
            System.out.println("The amount of the towels have been removed from the bathroom is " + remove + ". " +
                    " Only " + leftover+" has left.");
        }else{
            System.out.println("Sorry, the process can not be completed due to not enough towels.");
        }
    }


    public String getColorl() {
        return color;
    }

    public Furniture getBathfurniture() {
        return bathfurniture;
    }
}
