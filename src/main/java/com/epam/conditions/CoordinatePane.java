package com.epam.conditions;

public class CoordinatePane {

    public void printQuadrant(int x, int y) {
        String quadrant = "";
        if (x == 0 || y == 0) {
            quadrant = "zero";
        } else if (x > 0 && y > 0) {
            quadrant = "first";
        } else if (x > 0 && y < 0) {
            quadrant = "second";
        } else if (x < 0 && y < 0) {
            quadrant = "third";
        } else
            quadrant = "fourth";
        System.out.println(quadrant);
    }
}

