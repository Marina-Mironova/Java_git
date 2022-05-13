package com.company;

public class Task14 {
    public static void main(String[] args) {
        //Реализовать метод, который возвращает часть заданной строки, начиная с позиции start,
        //заканчивая позицией finish. (разбирали в классе, но можно реализовать самостоятельно).
        //Например: substring(“let’s talk about java”, 7,20) -> “talk about ja”
        startFinishString("let’s talk about java", 7,20);
    }

    public static void startFinishString(String str, int start, int finish){
        if (start<0 || start>str.length() || finish<start || finish<0 || finish>str.length()) {
            System.out.println("Error!");
            return;
        }
        for (int i = start; i <= finish; i++) {
            System.out.print(str.charAt(i));

        }
        System.out.println();
    }
}
