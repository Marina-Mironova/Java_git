package com.company;

public class Task4 {
    public static void main(String[] args) {
//      Implement your own split method. It should break a given string around matches of the char delimiter. As a result it should return array of substrings. Don’t use the String.split method
//For example:
//(“Java is very easy!”, ’ ‘) -> {“Java”,”is”,”very”,”easy”}
//(“Java is very easy!”, ’v‘) -> {“Ja”,“a is”,”ery easy”}
//(“Java is very easy!”,’!‘) -> {“Java is very easy”}
//(“Java is very easy!”,’:‘) -> {“Java is very easy!”}
    String phrase="Java is very easy!";
    printResult(phrase, splitString(phrase, 'e'));

    }
    
    public static String[] splitString(String phrase, char delimiter){
        String word="";
        int m=0;
        int arrayLength=0;
        for (int i = 0; i < phrase.length(); i++) {
            if(phrase.charAt(i)==delimiter)arrayLength++;
        }
        String[] stringArray=new String[arrayLength+1];
        for (int i = 0; i < phrase.length(); i++) {
            if(phrase.charAt(i)!=delimiter && i!=phrase.length()-1) {
                word = word + phrase.charAt(i);
            }
            else{
                stringArray[m]=word;
                word="";
                m++;


            }
        }
        return stringArray;
    }

    public static void printResult(String phrase, String[] stringArray){
        System.out.print(phrase+" -> ");
        for (int i = 0; i < stringArray.length; i++) {
            System.out.print(stringArray[i]+" ");
        }
    }
}