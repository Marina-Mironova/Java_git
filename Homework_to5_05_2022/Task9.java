package com.company;

public class Task9 {
    public static void main(String[] args) {
        //Реализовать метод, который int findFirstCharIndex(String str, char ch) который возвращает
        //позицию первого вхождения (индекс) символа ch в строке str. Если символа в строке нет,
        //возвращаем -1.
        //Например: find(“let’s talk about java”,’t’) -> 2
        System.out.println(findFirstCharIndex("let’s talk about java",'t'));
    }

    public static int findFirstCharIndex(String str, char ch){
        int firstChar=0;
        for (int i = 0; i < str.length(); i++) {
            if (ch != str.charAt(i)) {
                firstChar=-1;
            }
            else {
                firstChar=i;
                return firstChar;
            }
        }

        return firstChar;
    }
}
