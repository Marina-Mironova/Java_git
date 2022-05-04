package com.company;

public class Task4 {
    public static void main(String[] args) {
        //Реализовать метод int max3(int num1, int num2, int num3) который возвращает число,
        //наибольшее из трех переданных чисел:
        //Например: max3(10,19,0) -> 19


        System.out.println("Max number = "+ max3(6,8,87));
    }
        public static int max3(int num1, int num2, int num3){
            if (num1>num2 && num1>num3){
                return num1;
            }
            else if(num2>num1 && num2>num3){
                return num2;
            }
            else return num3;
        }

}
