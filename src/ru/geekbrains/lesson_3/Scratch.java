package ru.geekbrains.lesson_3;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Scratch{
    public static void main (String [] arr) {
        //1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0;
        int [] arr;
        arr = new int[8];
        arr [0] = 1;
        arr [1] = 1;
        arr [2] = 0;
        arr [3] = 0;
        arr [4] = 1;
        arr [5] = 1;
        arr [6] = 0;
        arr [7] = 0;
        for (int i = 0 ; i<arr.length ; i++) {
            if (arr[i] ==0) {
                arr[i] = 1;
            }
            else {
                arr[i] = 0;
            }
        }

        System.out.println(Arrays.toString(arr));
    }


    //Задать пустой целочисленный массив размером 8. Написать метод,
// который помощью цикла заполнит его значениями 1 4 7 10 13 16 19 22
    public static int ArrayThreePlus ([], int i) {
        int[] arr;
        arr = new int[9];
        for (i =0; i< arr.length; i++);
        arr[i] = 1+i*3;
        return [i]
        System.out.println(Arrays.toString([i] + " ");

        int [] arr;
        arr = new int[8];
        arr [0] = 1;
        arr [1] = 5;
        arr [2] = 3;
        arr [3] = 2;
        arr [4] = 11;
        arr [5] = 4;
        arr [6] = 5;
        arr [7] = 2;
        arr [8] = 4;
        arr [9] = 8;
        arr [10] = 9;
        arr [11] = 1;

        for (int i = 0 ; i<arr.length ; i++) {
            if (arr[i]<6) {
                arr[i]=arr[i]*2
            }

        }
        //Задать одномерный массив.
    // Написать методы поиска в нём минимального и максимального элемента;

int [] Arr4 = {3,2,5,12,55};
    public static int findMax (int [] arr){
        int max = arr[0];
        for(int i =0; i<arr.length-1; i++){
            if (arr) [i+1]>arr[i]{
                    max = arr[i+1];
            }
        }
    return max;
}
    }