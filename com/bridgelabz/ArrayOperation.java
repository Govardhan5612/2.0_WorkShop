package com.bridgelabz;

import java.util.Scanner;

/**
 * @author Govardhan Reddy
 */
public class ArrayOperation {
    /**
     * In this class provide and print array elements
     */
    Scanner input = new Scanner(System.in);
    Integer[] intArray;
    public void addArrayElements() {
        /**
         * In this method provide array elements from console
         */
        System.out.print("Enter length of array : ");
        int number = input.nextInt();
        intArray = new Integer[number];
        for (int i = 0; i < intArray.length; i++) {
            System.out.print("Enter " + (i + 1) + " value : ");
            intArray[i] = input.nextInt();
        }
    }
    public void print(){
        /**
         * In this method print the array use Array class and toString static method
         */
        System.out.println("Print elements of array : ");
        for (int i =0;i<intArray.length;i++){
            System.out.print(intArray[i]+" ,");
        }
        System.out.println();
    }



    public void printPositiveValues() {
        /**
         * In this method Print positive elements
         */


        System.out.println("Positive values : ");
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] >= 0) {
                System.out.print(intArray[i] + " ,");
            }
        }
        System.out.println();
    }
    public void printNegativeValues() {
        /**
         * In this method Print negative elements
         */


        System.out.println("Negative values : ");
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] < 0) {
                System.out.print(intArray[i] + " ,");
            }
        }
        System.out.println();
    }
}
