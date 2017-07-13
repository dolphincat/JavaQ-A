package com.dorrypractice;

/**
 * Created by dolphincat_yue on 3/8/17.
 */
public class Ourlander extends Car1 {

    private int roadServiceMonths;

    public Ourlander(int roadServiceMonths) {
        super("Outlander", "4WD", 5, 5, 6, false,1);
        this.roadServiceMonths = roadServiceMonths;
        System.out.println(getName()+" "+getSize());

    }

    public void acceleate(int rate){

        int newVelocity = getCurrentVelocity() + rate;
        if (newVelocity == 0){
            stop();
        } else if(newVelocity > 0  && newVelocity <=10){
            changeGear(1);
        } else if (newVelocity <10 && newVelocity <=20) {
            changeGear(2);
        }
            else if(newVelocity>20 && newVelocity <=30){
                changeGear(3);
            } else
                changeGear(4);

        if (newVelocity > 0 ){
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }
}
