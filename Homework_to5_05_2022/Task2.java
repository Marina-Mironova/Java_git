package com.company;

public class Task2 {
    public static void main(String[] args) {
        //Реализовать метод boolean isDivisible(int number1, int number2) который возвращает
        //true если number1 делится на number2 без остатка. Аналогично первой задаче
        //реализовать метод печати результата.
        int number1=2;
        int number2=456;
        boolean result=isDivisible(number1,number2);
        printResult(result, number1, number2);


    }

    public static boolean isDivisible(int number1, int number2){
        if (number1%number2==0){
            return true;
        }
        else return false;
    }

    public static void printResult(boolean result, int number1,int number2){
        if (result==true && number1!=0 && number2!=0){
            System.out.println("The number "+ number1 +" is divisible by " +number2);
        }
        else if (result==false  && number2!=0){
            System.out.println("The number " +number1+" cannot be divisible by "+number2);
        }
        else if(number1==0 && number2!=0){
            System.out.println("The number "+number1+" = 0.");
        }
        else {
            System.out.println("Division by 0 is impossible.");
        }
    }
}
