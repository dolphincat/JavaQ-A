package com.dorrypractice;

/**
 * Created by dolphincat_yue on 3/7/17.
 */
public class car extends vehicle{

    private int life;
    private String made;

    public car(int doors, int miles, double price, String name, int speed, String color, int life, String made) {
        super(doors, miles, price, name, speed, color);
        this.life = life;
        this.made = made;
    }

    public int getLife() {
        return life;
    }

    public String getmade() {
        return made;
    }
}
