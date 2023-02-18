package com.epam.loops;

public class Power {

    public void printPower(int numberToPrint, int power) {
        int powerMulty=1;
        for (int i = 0; i <power ; i++) {
            powerMulty*=numberToPrint;
        }
        System.out.println(powerMulty);
    }

    public static void main(String[] args) {
        new Power().printPower(0, 5);
    }

}
