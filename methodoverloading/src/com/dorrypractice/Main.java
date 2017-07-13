package com.dorrypractice;

public class Main {

        public static void main(String[] args){

            System.out.println(calcFeetAndInchesToCentimeters(20));
            System.out.println(calcFeetAndInchesToCentimeters(7,-5));
        }


        public static double calcFeetAndInchesToCentimeters(int feet, int inches){
            if ((feet>=0)&&(inches>=0)&&(inches<=12)){
                //do the calculation
                double centi = 2.54*(inches+12*feet);
                return centi;
            }
            else
                System.out.println("Invalid Information");
                return -1;
        }

        public static double calcFeetAndInchesToCentimeters(int inches){
            if(inches>=0){
                //calculate feet and inches
                int f1 =inches/12;
                int inch =inches%12 ;
                //call the other method to pass the information and calculate centi
                return calcFeetAndInchesToCentimeters(f1,inch);
            }
            return -1;
        }

}
