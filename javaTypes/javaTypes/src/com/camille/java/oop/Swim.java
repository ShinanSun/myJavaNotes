package com.camille.java.oop;

public interface Swim {
    public static final boolean HOW_TO_SWIM = true;

    public abstract void swim();

    public default void exercise() {
        System.out.println("this is my default exercise");
    }

    public static void show() {
        System.out.println("this is static show");
    }


}
