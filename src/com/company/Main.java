package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число в бинарном формате:");
        String str = scanner.nextLine();
        char[] array = str.toCharArray();
        int result = 0;
       for(int i = 0; i<array.length; i++){
            result +=(array[i]=='1'? 1 : 0) * (int) Math.pow(2,i);
           }
        System.out.println("Число " +  str +  " в десятичном формате = " + result);
    }
}

