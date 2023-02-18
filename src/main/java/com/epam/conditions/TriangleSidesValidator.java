package com.epam.conditions;

public class TriangleSidesValidator {

    public static void validate(double firstSide, double secondSide, double thirdSide) {
        if (
                firstSide + secondSide > thirdSide &&
                        firstSide + thirdSide > secondSide &&
                        secondSide + thirdSide > firstSide
        ) {
            System.out.println("this is a valid triangle");
        } else
            System.out.println("it's not a triangle");
    }

    public static void main(String[] args) {
        TriangleSidesValidator.validate(1, -1, 4);
    }
}
