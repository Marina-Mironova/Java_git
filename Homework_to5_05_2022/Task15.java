package com.company;

public class Task15 {
    public static void main(String[] args) {
        //Представьте, что вы пишите банковскую программу. Вам нужно реализовать метод,
        //который вместо заданной строки с номером счета (например ”DE5128279087265”)
        //возвращает строку вида ”DE51*********65” (количество звездочек соответствует количеству
        //засекреченных цифр)
        System.out.println(changeToStars("DE5128279087265"));
    }

    public static String changeToStars(String str){
        String new_result="";
        for (int i = 0; i < str.length(); i++) {
           if(i>3 && i<str.length()-2) new_result=new_result+"*";
           else new_result=new_result+str.charAt(i);
        }
        return new_result;
    }
}
