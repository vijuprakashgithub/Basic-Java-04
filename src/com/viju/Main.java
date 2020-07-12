package com.viju;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	int[] number1 = new int[10]; // Here we declare an one dimensional array with a size of 10
    number1[0] = 15;
    number1[1] = 24;
    number1[2] = 30;
    number1[3] = 45;
    number1[4] = 10;
    System.out.println(Arrays.toString(number1)); // This is a common method to display all array values.
    number1[5] = 74;
    System.out.println(number1[5]); // This is a common method to display one array value.
    System.out.println("Length of the first array is "+number1.length); // length keyword is used to display the size of an array
    int[] number2 = Arrays.copyOf(number1, 5); // This statement is used to copy values from one array to another array from index:0 to certain length
    System.out.println(Arrays.toString(number2));
    int[] number3 = {100, 200, 300, 400};
    System.out.println(Arrays.toString(number3));
    int[] number4 = number3.clone(); // This keyword is used to copy all array values to another array.
    System.out.println(Arrays.toString(number4));
    float[] number5 = {100.45F, 342.56F, 90.43F, 321.432F, 5783.432F}; //Array with full of floating point numbers.
    System.out.println(Arrays.toString(number5));
    float[] number6 = Arrays.copyOfRange(number5, 2, 4); // This statement is used to copy values from one array to another array from certain index to certain index.
    System.out.println(Arrays.toString(number6));
    double[] number7 = {232.5893, 5782930.784, 4593929,95739404};
    System.out.println(Arrays.toString(number7));
    long[] number8 = {3847L, 4782974738L, 7478293L, 8493746289L};
    System.out.println(Arrays.toString(number8));
    char[] letters1 = {'V','i','j','u'};
    char[] letters2 = {'P','r','a','k','a','s','h'};
    StringBuilder sb = new StringBuilder(); //Her sb is an object which is used to build a string from character array.
    sb.append(letters1);
    sb.append(letters2);
    char[] letters3 = sb.toString().toCharArray();
    System.out.println(Arrays.toString(letters3));
    }
}
