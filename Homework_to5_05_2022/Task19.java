package com.company;

public class Task19 {
    public static void main(String[] args) {
        //Реализовать метод, который возвращает массив из первых n четных чисел, начиная с
        //заданного числа start
        //Например, для заданных n=4, start=21: {22,24,26,28,4}
        int[] array=evenArrayFromStart(4,21);
        printArray(array);
    }

    public static int[] evenArrayFromStart(int n, int start){
        int[] array= new int[n];
        if(start%2==0) array[0]=start;
        else array[0]=start+1;
        for (int i = 1; i < n; i++) {
            array[i]=array[i-1]+2;
        }
        return array;
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
}
