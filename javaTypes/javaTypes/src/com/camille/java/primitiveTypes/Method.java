package com.camille.java.primitiveTypes;

public class Method {
    public static void main(String[] args) {
        operators();
        System.out.println(sum(3, 77));
    }

    public static void operators() {
        double num1 = 20.00d;
        double num2 = 80.00d;
        boolean result = ((num1 + num2) * 100 % 40.00) == 0.00;
        System.out.println(result);
        if (!result) System.out.println("got some reminder");
    }

    public static int sum(int x, int y) {
        return x + y;
    }
}
