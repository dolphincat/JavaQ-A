package com.dorrypractice;

/**
 * Created by dolphincat_yue on 3/9/17.
 */
public class EnhancedPlayer {

    //"private" makes sure that field is not accessible by anyclass outside this class
    private String name;
    private int hitPoints = 100;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if(health>0 && health <=100) {
            this.hitPoints = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth( int damage){
        this.hitPoints = this.hitPoints - damage;
        if(this.hitPoints <=0){
            System.out.println("Player knocked out");
            //reduce number of lives remaining for the player
        }
    }


    public int getHealth() {
        return hitPoints;
    }
}
