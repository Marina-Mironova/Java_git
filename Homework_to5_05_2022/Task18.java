package com.company;

public class Task18 {
    public static void main(String[] args) {
        //Дан массив целых чисел. Реализовать метод, который возвращает сумму всех
        //положительных элементов данного массива
        //Например: {1,3,6,-1,4,-3,1} -> 15
        int[] array={1,3,6,-1,4,-3,1};
        System.out.println(sumOfPositive(array));
    }
    public static int sumOfPositive(int[] array){
        int sum=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]>0) sum=sum+array[i];
        }
        return sum;
    }
}
