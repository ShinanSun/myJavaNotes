package com.camille.java.array;

import java.util.Arrays;
import java.util.Random;

public class CreateArray {
    public static void main(String[] args) {
        /*
        静态化create array。 直接赋值。
         */
        // Initialize Java ARRAY, array always initialize with one single type.
        int[] arr = {13, 1, 12, 11, 6, 0};

        int sameArrAbove[] = {13, 1, 12, 11, 6, 0};

        String[] myStr = {"hello", "world"};

        double[] d = new double[]{1.1, 3.3, 2.09};

        long[] l = new long[]{9L, 11L, 4567890854567L};

        // reassign
        myStr[0] = "hola";

        System.out.println(myStr[0] + " " + myStr[1] + "my array length is " + myStr.length);

        System.out.println(myStr); //[Ljava.lang.String;@452b3a41 this is the address of this array.

        /*
        动态化 create array， 先定义， 后赋予值。 一旦定义后会有默认值。

        默认值的规则：
        byte， short， int， long， char -》 0
        float， double -》 0.0
        boolean -> false;
        其他全部初始值是 null
         */
        // initialize array only with type and length. later we will assign elements
        int[] ages = new int[3]; // default is 0
        double[] scores = new double[5];
        scores[0] = 99.8;
        scores[1] = 95.5;
        System.out.println(scores[3]); // default double is 0.0


        String[] names = new String[2]; // default is null;
        names[1] = "camille";
        System.out.println(names[0]); // print null

        System.out.println("------Char--------");
        char[] myChar = new char[9];
        System.out.println(myChar[8]);
        System.out.println((int) myChar[7]);

        System.out.println("------boolean--------");
        boolean[] myBool = new boolean[3];
        System.out.println(myBool); // only print address.
        System.out.println(Arrays.toString(myBool)); // print everything in the array.
        System.out.println(myBool[0]);

        System.out.println("------for loop the array --------");

        for (int i = 0; i < scores.length; i++) {
            System.out.println("Score array index " + i + " is " + scores[i]);
        }
        /*
        Score array index 0 is 99.8
        Score array index 1 is 95.5
        Score array index 2 is 0.0
        Score array index 3 is 0.0
        Score array index 4 is 0.0
         */


        System.out.println("--------Random-------");
        Random random = new Random();
        int newNumber = random.nextInt(9);
        System.out.println(newNumber);
        System.out.println(random.nextInt(2)); // the upper bound (exclusive), 0-2 不包括2.
    }
}
