package com.company;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
//        Implement the method that takes two Strings and return the String that contain chars from the first string mixed through one with chars from other String
//“abcd”, “qwer” -> “aqbwcedr”
//“ab”, “qwer” -> “aqbwer”
//“abcd”, “qw” -> “aqbwcd”

        Scanner sc = new Scanner(System.in);
        String text1 = sc.nextLine();
        String text2 = sc.nextLine();
        System.out.println(mixChar(text1, text2));
    }

    public static String mixChar(String text1, String text2) {
        String result = "";
        int m = 0;
        if (text1.length() > text2.length()) {
            for (int i = 0; i <= text2.length() - 1; i++) {
                result = result + text1.charAt(i) + text2.charAt(i);
                m = i;
            }
        } else {
            for (int i = 0; i <= text1.length() - 1; i++) {
                result = result + text1.charAt(i) + text2.charAt(i);
                m = i;
            }
        }

        if (text1.length() > text2.length()) {
            for (int i = m+1; i <= text1.length() - 1; i++) {
                result = result + text1.charAt(i);
            }
        } else {
            for (int i = m+1; i <= text2.length() - 1; i++) {
                result = result + text2.charAt(i);

            }
        }
        return result;
    }
}