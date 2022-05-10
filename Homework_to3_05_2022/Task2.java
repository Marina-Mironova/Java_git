package com.company;

public class Task2 {
    public static void main(String[] args) {
//        Implement the method that counts how many words in the given String. The words are separate by space. You have to use only length() and charAt() methods of String class.
//    “It’s new task for me” -> 5;
        String phrase="It’s new task for me";
        int wordsCount=wordsCountMethod(phrase);
        printResult(phrase, wordsCount);

    }

    public static int wordsCountMethod(String phrase){
        int wordsCount=0;
        for (int i = 0; i <= phrase.length()-1; i++) {
            if((phrase.charAt(i)==' ') || (i==phrase.length()-1)) {
                wordsCount++;
            }
        }
        return wordsCount;
    }

    public static void printResult(String phrase, int wordsCount){
        System.out.println(phrase+"->"+wordsCount);
    }
}
