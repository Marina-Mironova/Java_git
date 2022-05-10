package com.company;

public class Task7 {
    public static void main(String[] args) {
        //Реализовать метод, который принимает 2 параметра int start и int finish и возвращает сумму
        //всех чисел от start до finish включительно.
        //Например: sum(10,15) -> 75
        System.out.println("Сумма всех чисел равна "+sum(10,15));
    }
    public static int sum(int start, int finish){
        int sum=0;
        for (int i = start; i <=finish; i++) {
            sum=sum+i;
        }
        return sum;
    }
}
