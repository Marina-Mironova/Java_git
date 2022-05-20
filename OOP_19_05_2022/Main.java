package com.company;

public class Main {

    public static void main(String[] args) {
	    Auto auto1=new Auto("Toyota", 2000, "зелёный");
        Auto auto2=new Auto("Москвич", 1970, "красный");
        Auto auto3=new Auto("Nissan",2015,"бежевый");
        Auto auto4=new Auto("Жигули",1989,"голубой");
        Auto auto5=new Auto("Renault", 2020,"серебристый");

        Auto[] autoArray={auto1, auto2, auto3, auto4, auto5};
        for (int i = 0; i < autoArray.length; i++) {
            autoArray[i].print();
        }
    }
}
