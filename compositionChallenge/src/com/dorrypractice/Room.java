package com.dorrypractice;

/**
 * Created by dolphincat_yue on 3/8/17.
 */
public class Room {

    private Bathroom bathroom;
    private Furniture furniture;
    private boolean isMaster;

    public Room(Bathroom bathroom, Furniture furniture, boolean isMaster) {
        this.bathroom = bathroom;
        this.furniture = furniture;
        this.isMaster = isMaster;
    }


    public Bathroom getBathroom() {
        return bathroom;
    }

    public Furniture getFurniture() {
        return furniture;
    }

    public boolean isMaster() {
        return isMaster;
    }
}
