package com.company;

public class Task3 {
    public static void main(String[] args) {
//        Implement the method that takes two Strings and return the String that contain chars from the first string mixed through one with chars from other String
//    “abcd”, “qwer” -> “aqbwcedr”
//    “ab”, “qwer” -> “aqbwer”
//    “abcd”, “qw” -> “aqbwcd”
        String phrase1="abcd";
        String phrase2="qw";
        String mixResult=stringMix(phrase1, phrase2);
        printResult(phrase1, phrase2, mixResult);

    }

    public static String stringMix(String phrase1, String phrase2){
        String mixResult="";
        if(phrase1.length()>phrase2.length()) {
            int m=0;
            for (int i = 0; i <= phrase2.length() - 1; i++) {
                   mixResult = mixResult + phrase1.charAt(i)+phrase2.charAt(i);
                   m=i;
                }
            for (int i = m+1; i < phrase1.length(); i++) {
                mixResult=mixResult+phrase1.charAt(i);
            }
            }

        else {
            int n=0;
            for (int i = 0; i <= phrase1.length()-1 ; i++) {
                mixResult = mixResult + phrase1.charAt(i)+phrase2.charAt(i);
                n=i;
            }
            for (int i = n+1; i < phrase2.length(); i++) {
                mixResult=mixResult+phrase2.charAt(i);
            }
        }
        return mixResult;
    }

    public static void printResult(String phrase1, String phrase2, String mixResult){
        System.out.println(phrase1+", "
                +phrase2+"->"+mixResult);
    }
}
