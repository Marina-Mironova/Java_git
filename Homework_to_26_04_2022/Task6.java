package com.company;

import java.util.Scanner;

import static com.sun.tools.javac.util.StringUtils.toLowerCase;

public class Task6 {
    public static void main(String[] args) {
//        Implement the previous task for phrase. Ignore spaces, punctuation marks ( “, . –“) and regardless of case. Hint: use the String.toLowerCase method
//        isPalindrome(“А роза упала на лапу Азора”) -> true

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        if(isPalindrome(text)) System.out.println("Это полиндром.");
        else {
            System.out.println("Это не полиндром.");
        }
    }
    public static boolean isPalindrome(String text){
        text=toLowerCase(text);
        String result="";
        String simplifiedText="";
        for(int i=text.length()-1; i>=0; i--){
            switch(text.charAt(i)) {
                case ' ':
                case '.':
                case ',':
                case '-':
                    break;
                default:
                    result = result + text.charAt(i);
            }
        }

        for(int i=0;i<=text.length()-1;  i++){
            switch(text.charAt(i)) {
                case ' ':
                case '.':
                case ',':
                case '-':
                    break;
                default:
                    simplifiedText = simplifiedText + text.charAt(i);
            }
        }
        if(result.equals(simplifiedText)) return true;
        else return false;
    }
}
