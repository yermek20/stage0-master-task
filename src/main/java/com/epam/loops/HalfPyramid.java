package com.epam.loops;

public class HalfPyramid {

    public void printHalfPyramid(int cathetusLength) {
        int i = 1;
        while (i <= cathetusLength) {
            System.out.print(" ".repeat(cathetusLength - i));
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            i++;
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

}
