package com.company;

public class Task6 {
    public static void main(String[] args) {
        //Реализовать метод, который печатает все числа в диапазоне от 0 до 100, которые не
        //делятся на 4

        printIntNot4(100);
    }
    public static void printIntNot4(int num){
        for (int i = 0; i <=num ; i++) {
            if (i%4!=0){
                System.out.print(i+", ");
            }
        }
        System.out.println();
    }
}
