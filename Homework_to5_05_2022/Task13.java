package com.company;

public class Task13 {
    public static void main(String[] args) {
        //Реализовать метод, который печатает заданную строку, при этом каждый символ печатается
        //в [] Например: “Hello” -> [H][e][l][l][o]
        printString("Hello");
    }

    public static void printString(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.print("["+str.charAt(i)+"]");
        }
        System.out.println();
    }

}
