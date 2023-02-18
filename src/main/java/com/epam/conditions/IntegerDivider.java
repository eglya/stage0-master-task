package com.epam.conditions;

public class IntegerDivider {

    public static void printCompletelyDivided(int dividend, int divider) {
        System.out.println(divider==0?"division by zero":dividend/divider*divider-dividend==0?"can be divided completely":"cannot be divided completely");
    }
}
