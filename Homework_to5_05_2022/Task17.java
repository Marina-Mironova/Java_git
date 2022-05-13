package com.company;

public class Task17 {
    public static void main(String[] args) {
        //Дан массив целых чисел. Реализовать метод, который возвращает индекс минимальнго
        //значение в данном массиве.
        //Например: {1,3,6,-1,4,-3,1} -> 5
        int[] array={1,3,6,-1,4,-5,9};
        System.out.println("min index = "+minIndex(array));
    }
    public static int minIndex(int[] array){
        int min=array[0];
        int minIndex=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]<min) {
                min=array[i];
                minIndex=i;
            }
        }
        return minIndex;
    }
}
