package com.company;

public class Task8 {
    //*Реализовать метод, который принимает 3 параметра start, finish, digit типа int. digit
    //находится в диапазоне (0<=digit<9), если нет, то считаем digit=0. Метод должен вернуть
    //сумму всех чисел от start до finish исключая те числа, которые заканчиваются на digit.
    //Например: sum(10,15,3) -> 62 (в данном случае, в сумму входят числа 10,11,12,14 и15.
    //Число 13 не входит. )
    public static void main(String[] args) {
        System.out.println(sumDigit(10,15,3));
    }
    public static int sumDigit(int start, int finish, int digit){
        int sum=0;
        for (int i = start; i <= finish; i++) {
            if (i!=digit && i%10!=digit){
                sum=sum+i;
                System.out.println(i);
            }
        }
        return sum;
    }
}
