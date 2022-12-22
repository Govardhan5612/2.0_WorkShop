package com.bridgelabz;

/**
 * @author Govardhan Reddy
 */
public class ArrayMain {
    /**
     * In ArrayMain class Print array positive and negative elements
     */
    public static void main(String[] args) {
        ArrayOperation operation = new ArrayOperation();
        operation.addArrayElements();
        operation.print();
        operation.printNegativeValues();
        operation.printPositiveValues();
    }
}
