package com.company;

public class MyDate {
        int day;
        int month;
        int year;

        public MyDate(int d,int m, int y) {
                day=d;
                month=m;
                year=y;
        }

        public void print(){
                System.out.println(day+"/"+month+"/"+year+"/");
        }

        public String toString(){
                String str=year+"-"+month+"-"+day;
               return str;
        }
}