package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        int i = 1;
        while (i <= cathetusLength) {
            System.out.print(" ".repeat(cathetusLength - i));
            for (int j = i; j > 0; j--) {
                System.out.print(j);
            }
            for (int k = 2; k <= i; k++) {
                System.out.print(k);
            }
            i++;
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
