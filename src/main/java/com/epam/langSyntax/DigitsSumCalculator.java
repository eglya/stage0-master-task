package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int sum=0;
        String[] numbers = (number+"").split("");
        for (String s : numbers) {
            sum += Integer.parseInt(s);
        }
        System.out.println(sum);
    }
}
