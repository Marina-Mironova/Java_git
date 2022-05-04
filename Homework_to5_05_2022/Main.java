package com.company;

public class Main {

    public static void main(String[] args) {
	//Реализовать метод boolean isEven(int number) который возвращает true если переданное
        //число четное иначе возвращает false. Реализовать метод void printCheckResultMessage(int
        //number, boolean result) который выводит на экран строку вида «10 это четное число» или
        //“15 это не четное число»
        //Подсказка: Используем конструкцию if и оператор % modulo
            int number=0;
            boolean result=isEven(number);
            printResult(result, number);

    }

    public static boolean isEven(int number){
       if (number%2==0){
            return true;
       }
       else return false;
    }

    public static void printResult(boolean result, int number){
        if (result==true && number!=0){
            System.out.println("The number is even.");
        }
        else if (result==false){
            System.out.println("The number is odd.");
        }
        else{
            System.out.println("The number = 0.");
        }
    }
}
