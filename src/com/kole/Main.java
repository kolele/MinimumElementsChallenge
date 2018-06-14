package com.kole;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(findMin(readIntegers(3)));
    }

    public static int[] readIntegers(int counter){
        int[] tempArray = new int[counter];
        for (int i=0;i<tempArray.length;i++){
            System.out.println("Enter an integer to populate array: ");
            tempArray[i]= scanner.nextInt();
        }return tempArray;

    }

    public static int findMin(int[] array){
        int minValue = Integer.MAX_VALUE;
        for (int i=0;i<array.length;i++){
            if (array[i]<minValue){
                minValue=array[i];
            }
        }return minValue;
    }


}
