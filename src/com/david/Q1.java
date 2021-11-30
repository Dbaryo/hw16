package com.david;

import java.util.Random;

public class Q1 {

    public static void main(String[] args) {
	int[] numbers1 = new int[6];
    randomArray(numbers1);
    printArr(numbers1);
    int[] numbers2 = new int[7];
    randomArray(numbers2);
    printArr(numbers2);
    printArr(uniqeNumberArray(numbers1, numbers2));
        System.out.println(arrayToInt(numbers1));
        System.out.println(arrayToInt(numbers2));
    }

    //Write a method takes in an array and fills it with random numbers

    public static int [] randomArray(int[] arr){
        Random random = new Random();
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = random.nextInt(10);
        }
        return arr;
    }

    //rite a method that takes in 2 arrays and returns an array that
    // contains the numbers that only appear in one of the arrays
    // (If you have extra space in the array, you can fill it with -99)

    public static int[] uniqeNumberArray ( int[] arr1 , int[] arr2){
        int uniqeCounter = 0;
        int arrL = 0;
        int[] tempArr = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            if ( isUniqe( arr1[i], arr2 )) {
                tempArr[uniqeCounter] = arr1[i];
                uniqeCounter++;
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            if ( isUniqe( arr2[i], arr1 )) {
                tempArr[uniqeCounter] = arr2[i];
                uniqeCounter++;
            }
        }
        int[] uniqeArray = new int[uniqeCounter];
        for (int i = 0; i < uniqeArray.length; i++) {
            uniqeArray[i] = tempArr[i];
        }
    return uniqeArray;
    }

        public static boolean isUniqe (int num, int[] arr){
            for (int i = 0; i < arr.length; i++) {
                if ( num == arr[i] ){
                    return false;
                }
            }
            return true;
        }

        //Write a method that takes in an array (assume that this array only contains numbers from 0 to 9)
        // and returns a number made from all of these digits

    public static int arrayToInt ( int[] arr ){
        int square = arr.length - 1;
        int newNum = 0;
        for (int i = 0; i < arr.length; i++) {
            newNum += arr[i] * Math.pow(10, square );
            square--;
        }
        return newNum;
    }

    public static void printArr ( int [] arr ){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }
}
