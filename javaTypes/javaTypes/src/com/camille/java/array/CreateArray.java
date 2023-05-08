package com.camille.java.array;

public class CreateArray {
    public static void main(String[] args) {
        // Initialize Java ARRAY, array always initialize with one single type.
        int[] arr = {13, 1, 12, 11, 6, 0};

        String[] myStr = {"hello", "world"};

        double[] d = new double[]{1.1, 3.3, 2.09};

        long[] l = new long[]{9L, 11L, 4567890854567L};

        // reassign
        myStr[0] = "hola";

        System.out.println(myStr[0] + " " + myStr[1] + "my array length is " + myStr.length);

        System.out.println(myStr); //[Ljava.lang.String;@452b3a41 this is the address of this array.
    }
}
