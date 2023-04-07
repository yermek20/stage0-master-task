package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {

        int sum = 0, digit;

        while (number > 0) {
            digit = number % 10;
            sum += digit;
            number = number / 10;
        }
        System.out.println(sum);
    }

}
