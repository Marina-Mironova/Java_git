package com.company;


public class Main {

    public static void main(String[] args) {


//        Implement the method that print the String, which consists of given char of the given source string and repeated as many times as the given character occurs in the source string
//    “It’s new task for me”,’e’ -> “ee”;

        char letter='e';
        String phrase="It’s new task for me";
        String letterResult=charOfString(phrase, letter);
        printResult(phrase, letterResult);

    }

    public static String charOfString(String phrase, char letter){
        String letterResult="";
        for (int i = 0; i <= phrase.length()-1; i++) {
            if(phrase.charAt(i)==letter) {
                letterResult=letterResult+phrase.charAt(i);
            }
        }
        return letterResult;
    }

    public static void printResult(String phrase, String letterResult){
        System.out.println(phrase+"->"+letterResult);
    }
}
