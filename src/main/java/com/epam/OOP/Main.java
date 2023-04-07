package com.epam.OOP;

public class Main {
    public static void main(String[] args) {
        // Create object Bird
        Bird bird = new Bird();
        // Call overrided method of Animal, where added one more sentence to the description
        System.out.println(bird.getDescription());

        // Create object Dog
        Dog dog = new Dog();
        // Call method of Animal
        System.out.println(dog.getDescription());
    }
}
