package com.company;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
//        Implement the method that takes a strings and returns the new string that contains every second character of the original string
//“abcde” -> “bd”
//“Hello Java” -> “el aa”

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        System.out.println(secondChar(text));
    }

    public static String secondChar(String text){
        String result="";
        for(int i=0; i<=text.length()-1; i++){
            if(i%2!=0) result=result+text.charAt(i);
        }
        return result;
    }
}
