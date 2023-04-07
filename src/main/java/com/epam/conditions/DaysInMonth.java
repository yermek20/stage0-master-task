package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {

        boolean leap = false;

        // if the year is divided by 4
        if (year % 4 == 0) {

            // if the year is century
            if (year % 100 == 0) {

                // if year is divided by 400
                // then it is a leap year
                if (year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
            // if the year is not century
            else
                leap = true;
        }

        switch (month) {
            case 1:
                System.out.println(31);
                break;
            case 2:
                if (leap)
                    System.out.println(29);
                else
                    System.out.println(28);
                break;
            case 3:
                System.out.println(31);
                break;
            case 4:
                System.out.println(30);
                break;
            case 5:
                System.out.println(31);
                break;
            case 6:
                System.out.println(30);
                break;
            case 7:
                System.out.println(31);
                break;
            case 8:
                System.out.println(31);
                break;
            case 9:
                System.out.println(30);
                break;
            case 10:
                System.out.println(31);
                break;
            case 11:
                System.out.println(30);
                break;
            case 12:
                System.out.println(31);
                break;
            default:
                System.out.println("invalid date");
        }
    }

}
