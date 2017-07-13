package com.dorrypractice;

public class Main {

    public static void main(String[] args) {

        //int width of 32, store 2^31
        //short width of 16
        //byte width of 8

        int minval = -2_147_483_648;
        int maxval = 2_147_483_647;
        int mytotal = (minval)/2;

        byte mybytevalue = 10;
        byte newbyte = (byte)(mybytevalue/2);
        System.out.println(newbyte);
        /* a byte can contain between -128 ~127
            it takes alot less space than int;
         */

        short myshortvalue = -32768;
        short mylargestvalue = 32767;

        /*
        Choose the right type because on the mobile, sometimes there is
        not that much space for people to use
         */

        //long width of 64, store 2^63
        long mylongnumber = 100L;


        System.out.println("Practice");
        byte b1 = 58;
        short s1 = 567;
        int i1 = 6;
        long l1 = 5000L+10L*(b1+s1+i1);
        System.out.println(l1);


    }
}
