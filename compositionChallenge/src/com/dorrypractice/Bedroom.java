package com.dorrypractice;

/**
 * Created by dolphincat_yue on 3/8/17.
 */
public class Bedroom {

    private String name;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Celling cellingl;
    private Bed bed;
    private Lamp lamp;

    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Celling cellingl, Bed bed, Lamp lamp) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.cellingl = cellingl;
        this.bed = bed;
        this.lamp = lamp;
    }

    public void makeBed(){
        System.out.println("Bedroom.makeBed() is called");
        bed.make();

    }

    public String getName() {
        return name;
    }



    public Lamp getLamp() {
        return this.lamp;
    }
}
