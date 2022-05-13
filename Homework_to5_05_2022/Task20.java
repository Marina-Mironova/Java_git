package com.company;

public class Task20 {
    public static void main(String[] args) {
        //Дано два массива char одинаковой длинны. Написать метод, который выводит все символы,
        //которые совпадают и имеют одинаковые индексы и в первом и во втором массиве.
        //Например: {‘a’,’b’,’c’,’d’}, {‘d’,’b’,’c’,’f’} ->bc
        char[] array1={'a','b','c','d'};
        char[] array2={'d','b','c','f'};
        printSameSymbolsOfArray(array1, array2);
    }
    public static void printSameSymbolsOfArray(char[] array1, char[] array2){
        for (int i = 0; i < array1.length; i++) {
            if (array1[i]==array2[i]) System.out.print(array1[i]+" ");
        }
    }
}
