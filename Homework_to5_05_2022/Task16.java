package com.company;

public class Task16 {
    public static void main(String[] args) {
        //Дан массив целых чисел. Реализовать метод, который возвращает минимальное значение
        //в данном массиве.
        //Например: {1,3,6,-1,4,-5,9} -> -5
        int[] array={1,3,6,-1,4,-5,9};
        System.out.println("min = "+minValue(array));
    }
    public static int minValue(int[] array){
        int min=array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]<min) min=array[i];
        }
        return min;
    }
}
