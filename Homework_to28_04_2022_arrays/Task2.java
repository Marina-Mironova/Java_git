package com.company;

public class Task2 {
    public static void main(String[] args) {
//        Implement a method that returns the sum of elements of the given array of int
//        {10, 3, 23, 5, -9} -> 32
        int sum=0;
        int[] array={10, 3, 23, 5, -9};
        sum=sumOfArray(array);
        printResult(sum);
    }
    public static int sumOfArray(int[] array){
        int sum=0;
        for (int i = 0; i < array.length-1; i++) {
            sum=sum+array[i];
        }
        return sum;
    }

    public static void printResult(int sum){
        System.out.println("The sum of elements = "+sum);
    }
}
