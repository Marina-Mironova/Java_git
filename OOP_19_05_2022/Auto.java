package com.company;

public class Auto {
    String model;
    int createYear;
    String color;

    public Auto(String mod, int year, String col){
        model=mod;
        createYear=year;
        color=col;
    }

    public void print(){
        System.out.println("Модель: "+model);
        // System.out.println("--------------------");
        System.out.println("Год выпуска: "+createYear);
        System.out.println("Цвет: "+color);
        System.out.println("_______________________________");
    }
}
