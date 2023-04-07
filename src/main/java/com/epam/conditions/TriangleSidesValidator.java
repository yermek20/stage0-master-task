package com.epam.conditions;

import com.epam.OOP.Main;

public class TriangleSidesValidator {

    public void validate(double firstSide, double secondSide, double thirdSide) {
        if ((firstSide+secondSide)>thirdSide && (firstSide+thirdSide)>secondSide && (secondSide+thirdSide)>firstSide) {
         //   double s = (firstSide+secondSide+thirdSide) / 2;
         //   double area = Math.sqrt(s*(s-firstSide)*(s-secondSide)*(s-thirdSide));
            System.out.println( "this is a valid triangle");
        } else {
            System.out.println("it's not a triangle");
        }
    }

}
