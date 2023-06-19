package com.camille.java.primitiveTypes;

public class Method {
    public static void main(String[] args) {
        operators();
        System.out.println(sum(3, 77));
        getSomeStrings();
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

    public static void getSomeStrings() {
        char[] chars = {'a', 'b', 'c'};
        String s1 = new String(chars);
        String s2 = new String(chars);

        byte[] myChars = {97, 98, 99};

        String s3 = new String(myChars);
        System.out.println(chars);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        int[] numbers = {1, 2, 3};
        System.out.println(numbers);
    }
}
