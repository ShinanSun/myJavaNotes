package com.camille.java.oop;

public class Dog extends Animal implements Swim{
    public Dog(String name, int age) {
        super(name, age);
    }

    public Dog() {
    }

    @Override
    public void eat() {
        System.out.println("dog eating bones");
    }

    @Override
    public void swim() {
        System.out.println("dog can swim.");
    }

    @Override
    public void exercise() {
        System.out.println("overriding default exercise");
    }
}
