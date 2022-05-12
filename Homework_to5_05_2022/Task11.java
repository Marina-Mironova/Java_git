package com.company;

public class Task11 {
    public static void main(String[] args) {
        //Реализовать метод, который возвращает длину общего префикса двух строк, т.е. сколько
        //символов начиная с начала одинаковые у обеих строк.
        System.out.println("My name is Marina. "+ "My name is Timur"+" ->prefix = "+stringPrefixLength("My name is Marina.", "My name is Timur"));
    }
    public static int stringPrefixLength(String str1, String str2){
        int i=0;
        int prefixLength=0;
        while(i< str1.length() && i<str2.length()){
            if (str1.charAt(i)!=str2.charAt(i)) return prefixLength;
            else prefixLength++;
            i++;
        }
        return prefixLength;

    }
}
