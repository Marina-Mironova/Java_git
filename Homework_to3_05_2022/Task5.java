package com.company;

public class Task5 {
    public static void main(String[] args) {
        //Given array String[]. Implement the method that returns the shortest String from it.
        String[] array={"djhtf", "hgfhktf", "jgkhgh", "j", ".", "jhkihyiu"};
        printResult(minStringOfArray(array));

    }
    public static String minStringOfArray(String[] array){
        String min=array[0];
        for (int i = 0; i < array.length; i++) {
            String arrElement=array[i];
            if (arrElement.length()<min.length()) min=arrElement;
        }
        return min;
    }
    public static void printResult(String result){
        System.out.println(result + " is the shortest String of our array.");
    }
}
