package com.company;

public class Main {

    public static void main(String[] args) {
	// Implement a method that returns the index of the biggest element of a given array of int
        //{10, 33, 3, 5, -9} -> 1
        int maxElement=0;
        int[] array={-5,5,-7,-7,-9,456,23,0};
        maxElement=maxElementOfArray(array);
        printResult(maxElement);

    }

    public static int maxElementOfArray(int[] array){
        int maxElement=array[0];
        for (int i = 0; i < array.length-1; i++) {
            if (array[i]>maxElement){
                maxElement=array[i];
            }
        }
        return maxElement;
    }

    public static void printResult(int maxElement){
        System.out.println("The biggest element of this array is " + maxElement);
    }
}
