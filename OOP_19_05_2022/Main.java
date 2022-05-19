package com.company;

public class Main {

    public static void main(String[] args) {
	   /* MyDate date1=new MyDate();
        date1.day=10;
        date1.month=5;
        date1.year=2022;*/

        MyDate date1=new MyDate(10,5,2022);
        MyDate date2=new MyDate(10,5,2022);
        MyDate date3=new MyDate(10,5,2022);
        MyDate date4=new MyDate(10,5,2022);
        MyDate date5=new MyDate(10,5,2022);

        MyDate[] dateArray={date1, date2, date3, date4,date5};
        for (int i = 0; i < dateArray.length; i++) {
            dateArray[i].print();
        }

        date1.print();

        MyDate newDAte=addDay(date1);
        newDAte.print();
    }
   /* public static void printDate(MyDate date){
        System.out.println(date.day+"/"+date.month+"/"+date.year);*/
  //  }



    public static MyDate addDay(MyDate date){
        MyDate result= new MyDate(date.day+1, date.month, date.year);
        result.day=date.day+1;
        result.month=date.month;
        result.year=date.year;
        return result;
    }
    /*public static MyDate createMyDate(int day, int month, int year){
        MyDate result=new MyDate();
        result.day=day;
        result.month=month;
        result.year=year;
        return result;
    }*/
}
