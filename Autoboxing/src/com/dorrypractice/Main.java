package com.dorrypractice;


import java.util.ArrayList;

class IntClass{
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}



public class Main {

    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Dorry");

        //int is not a class, so we can not use ArrayList<int>
        //will need to create an int Class

        ArrayList<IntClass> intArrayList = new ArrayList<IntClass>();
        intArrayList.add(new IntClass(50));
        Integer integer = new Integer(51);
        Double doublenumber = new Double(0.22);

        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
        for (int i=0;i<10;i++){
            integerArrayList.add(Integer.valueOf(i));//auto-boxing: primitive type-->Integer class
            //valueOf(i) convert i from primitive type into Integer Class so we can use it as a class
        }
        for (int i=0;i<10;i++){
            System.out.println(i+" --> "+integerArrayList.get(i).intValue());//unboxing
        }

        Integer myIntValue = 56;//java can recognize this as Integer.valueOf(56)
        int myInt = myIntValue.intValue();

        ArrayList<Double> myDoubleValue = new ArrayList<Double>();
        for (double dbl=0.0;dbl<=10.0;dbl+=0.5){
            myDoubleValue.add(Double.valueOf(dbl));
        }
        for(int i=0;i< myDoubleValue.size();i++){
            double value = myDoubleValue.get(i).doubleValue();
            System.out.println(i+" --> "+value);

        }
    }
}
