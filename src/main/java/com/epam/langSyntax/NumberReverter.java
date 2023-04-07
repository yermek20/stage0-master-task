package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {

        int reverse = 0;
        int reminder;

        while (number != 0) {
            reminder = number % 10;
            reverse = reverse * 10 + reminder;
            number /= 10;
        }

        System.out.println(reverse);
    }

}
