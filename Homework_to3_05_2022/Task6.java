package com.company;

public class Task6 {
    public static void main(String[] args) {
        //Given arrays String[] names and int[ ] yearsOfBirthday of the same length, that contains names and years of birthday of the persons. Every element in yearsOfBirthday is corresponding with element at the same index in names. Implement the program that prints the name and the age of all person who older that given int. Than print the name and age of oldest person.
        //For example: ({“Olga”,”Oleg”,”Svetlana”,”Oleg”} , {2004,1982,2008,2010},15) ->
        //Olga 18 years
        //Oleg 40 years

        String[] names= {"Olga","Oleg","Svetlana","Oleg"};
        int[] yearsOfBirthday={2004,1982,2008,2010};
        printNameAge(names, yearsOfBirthday, 15);
        maxNameAge(names, yearsOfBirthday);
    }
    public static void printNameAge(String[] names, int[] yearsOfBirthday, int age){
        for (int i = 0; i < names.length; i++) {
            if(age<(2022-yearsOfBirthday[i])) {
                System.out.print(names[i] + " " + (2022-yearsOfBirthday[i]) + " years");
                System.out.println();
            }
        }
    }

    public static void maxNameAge(String[] names, int[] yearsOfBirthday){
        int minYear=yearsOfBirthday[0];
        String minYearName=names[0];
        for (int i = 0; i < yearsOfBirthday.length; i++) {
            if (yearsOfBirthday[i]<minYear) {
                minYear=yearsOfBirthday[i];

                minYearName=names[i];
            }
        }
        System.out.println(minYearName+" is the oldest person ("+(2022-minYear)+" years old).");
    }
}
