package com.company;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
//        Given the String like “20*((876/8)+19)” , implements the method that check if the parentheses are correct. Try to solve it yourself without help of Google
//“9*(8+3)-( (9+1)5)” -> true
//“9(8+3)- (9+1)5)” -> false
//“98+3)-( (9+1)*5” -> false

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        if((checkParenthesesNumber(text)==true)) System.out.println("Расстановка скобок верна.");
        else System.out.println("Parentheses error");

    }

    public static boolean checkParenthesesNumber(String text){
        int resultOpenParentheses=0;
        int resultCloseParentheses=0;
        for(int i=0; i<=text.length()-1; i++){
            if(text.charAt(i)=='(') resultOpenParentheses++;
            if(text.charAt(i)==')') resultCloseParentheses++;
        }
        if(resultOpenParentheses==resultCloseParentheses) return true;
        else return false;
    }


    //не придумала, как проверить правильную последовательность расстановки скобок
//    public static boolean checkParenthesesOrder(String text){
//        int resultOpenParentheses=0;
//        int resultCloseParentheses=0;
//        for(int i=0; i<=text.length()-1; i++){
//            if(text.charAt(i)=='(') resultOpenParentheses++;
//            if(text.charAt(i)==')') resultCloseParentheses++;
//        }
//        if(resultOpenParentheses==resultCloseParentheses) return true;
//        else return false;
//}
}

