package com.company;

public class Task5 {
    public static void main(String[] args) {
        //Реализовать метод String longestString (String str1, String str2, String str2) который
        //возвращает самую длинную строку из трех заданных строк:
        //Подсказка: Используйте метод, написанный в пункте 4
        //Например: longestString (“java”,”welcome”,”hello”) -> “welcome”


        System.out.println(longestString ("java","welcome","hello"));
    }

    public static String longestString(String str1, String str2, String str3){
        if (str1.length()>str2.length() && str1.length()>str3.length()){
            return str1;
        }
        else if(str2.length()>str1.length() && str2.length()>str3.length()){
            return str2;
        }
        else return str3;
    }
}
