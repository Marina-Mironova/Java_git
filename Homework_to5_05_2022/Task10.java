package com.company;

public class Task10 {
    public static void main(String[] args) {
        //Реализовать метод, который int findLastCharIndex(String str, char ch) который возвращает
        //позицию последнего вхождения (индекс) символа ch в строке str. Если символа в строке
        //нет, возвращаем -1.
        //Например: find(“let’s talk about java”,’t’) -> 15
        System.out.println(findLastCharIndex("let’s talk about java",'t'));
    }

    public static int findLastCharIndex(String str, char ch){
        int lastCharPosition=0;
        for (int i = 0; i < str.length(); i++) {
            if (ch==str.charAt(i)) lastCharPosition=i;
        }
        return lastCharPosition;
    }
}
