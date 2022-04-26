package com.company;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
//        Write method boolean isPalindrome(String) that checks whether a given word is a palindrome. A palindrome is a word that reads the same from the front and the back.
//isPalindrome(“довод”) -> true
//isPalindrome(“невод”) -> false
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        if(isPalindrome(text)) {
            System.out.println("Это полиндром.");
        }
        else {
            System.out.println("Это не полиндром.");
        }
    }
    public static boolean isPalindrome(String text){
        String result="";
        for(int i=text.length()-1; i>=0; i--){
            result=result+text.charAt(i);
        }
        if(result.equals(text)) {
            return true;
        }
        else {
            return false;
        }
    }
}
