package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        char[] charsNumber = String.valueOf(number).toCharArray();
        for (int i = charsNumber.length - 1; i >= 0; i--) {
            System.out.print(charsNumber[i]);
        }
    }
}
