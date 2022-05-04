package com.company;

public class Task3 {
    public static void main(String[] args) {
//        Реализовать метод, который в качестве параметров получает 3 числа типа инт. Метод
//        должен возвращать true если и первое и второе число делятся без остатка на третье.
//                Подсказка: Используйте метод, написанный в пункте 2
        int number1=2000;
        int number2=45;
        int number3=6;
        boolean result=isDivisible(number1,number2, number3);
        printResult(result, number1, number2, number3);
    }

    public static boolean isDivisible(int number1, int number2, int number3){
        if (number1%number3==0 && number2%number3==0){
            return true;
        }
        else return false;
    }

    public static void printResult(boolean result, int number1,int number2, int number3){
        if (result==true && number3!=0){
            System.out.println("Both numbers are divisible by " +number3);
        }
        else
            System.out.println("One or both numbers cannot be divisible by "+number3);

    }
}
