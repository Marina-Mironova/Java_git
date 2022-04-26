package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Implement the method that counts how many words in the given String. The words are separate by space. You have to use only length() and charAt() methods of String class.
//“It’s new task for me” -> 5;
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        System.out.println("There are "+ wordCounter(text)+" words here.");


    }

    public static int wordCounter(String text){
        int wordCount=0;
        for(int i=0; i<=text.length()-1; i++){
            char result=text.charAt(i);
            if((result==' ')||(i==text.length()-1)){
                wordCount++;
            }
        }
        return wordCount;
    }
}
