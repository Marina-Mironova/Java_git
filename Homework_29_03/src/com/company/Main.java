package com.company;

public class Main {

    public static void main(String[] args) {
/*
        1.Implement a method that prints the given String N times.
        printLineNtimes(“hello”,3) -> hello
                hello
        hello*/
            System.out.println("Task1:");
            printLineNtimes("hello",3);


       /* 2.Implement method “countdown” that prints numbers from 5 to 1, than prints „start“
        countdown() -> 5
        4
        3
        2
        1
        Start*/
        System.out.println("Task2");
        countdown(5,1);

       /* 3.Given two integers number1 and number2. Implement method that printы all numbers between number1 and number2 that divisible by 3.
        Example: printDivisibleByTree(10,20) ->
        12
        15
        18*/
        System.out.println("Task3");
        printDivisibleByThree(10,20);


       /* 4.Given two integers number1 and number2. Implement method that returns the sum of all numbers between number1 and number2 that divisible by 3.
        Example: getSumDivisibleByTreeNumbers(20,10) -> 45*/

        System.out.println("Task4");
        getSumDivisibleByTreeNumbers(20,10);

       /* 5. *Implement method that prints that prints multiply table
        1 2 3 4 ……… 9 10
        2 4 6 8 ……… 18 20
        3 6 9 12 …….27 30
        ………………………………
        10 20 30 …… 90 100*/
        System.out.println("Task5");
        tableOfNumbers();

    }

    public static void printLineNtimes(String word, int n) {
        int i=1;
        while(i<=n){
            System.out.println(word);
            i++;
        }
    }

    public static void countdown(int num1,int num2){
           if(num1<num2) {
               System.out.println("incorrect input: num1>num2");
               return;
           }

            while(num1>=num2){
                System.out.println(num1);
                num1--;
            }
    }


    public static void printDivisibleByThree(int number1, int number2) {
            if(number1>number2) {
               int t;
               t=number2;
               number2=number1;
               number1=t;
            }
            else if ((number1==0)&&(number2==0)){
                System.out.println("no loop is possible");
                return;
            }
            while(number1<=number2){
                if(number1%3==0){
                    System.out.println(number1);

                }
                number1++;
            }
        }

        public static void getSumDivisibleByTreeNumbers(int nummer1,int nummer2){
            if(nummer1>nummer2) {
                int t;
                t=nummer2;
                nummer2=nummer1;
                nummer1=t;
            }
            else if ((nummer1==0)&&(nummer2==0)){
                System.out.println("no loop is possible");
                return;
            }
        int summa=0;
            while(nummer1<=nummer2){
                if(nummer1%3==0){
                    summa=summa+nummer1;

                }
                nummer1++;
            }
            System.out.print("summa="+summa);
        }


    public static void tableOfNumbers(){
        int num1=1;
        int num2=10;
        int num11=1;
        int i=1;
        int num12=10;

        while(num1<=num2){
            while(num11<=num12){
                if(num11%i==0){
                    System.out.print(num11+" ");
                }
                num11++;

            }
            System.out.println(" ");
            i++;
            num11=1;
            num12=10*i;
            num1++;
        }
    }
}
