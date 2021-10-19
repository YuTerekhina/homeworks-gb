package ru.gb;

import java.util.Arrays;
import java.util.Random;

public class HomeWork03 {

    public static void main(String[] args) {
        System.out.println("Задание №1");
        System.out.println("----------------------------");
        changesNum();

        System.out.println();
        System.out.println("----------------------------");
        System.out.println("Задание №2");
        System.out.println("----------------------------");
        arrayInt();

        System.out.println();
        System.out.println("----------------------------");
        System.out.println("Задание №3");
        System.out.println("----------------------------");
        multiplyNum();

        System.out.println();
        System.out.println("----------------------------");
        System.out.println("Задание №4");
        System.out.println("----------------------------");
        changeDiagonals();
    }

    public static void changesNum() {
        int arr[] = new int[10];
        final Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(2);
        }
        System.out.println("Начальный массив:");
        System.out.print(Arrays.toString(arr));
        System.out.println();
        System.out.println("Измененный массив:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0){
                arr[i] = 1;
            } else arr[i] = 0;
        }
        System.out.print(Arrays.toString(arr));

    }

    public static void arrayInt() {
        int arr[] = new int[100];
        for (int i = 0; i < arr.length; i++){
            arr[0] = 1;
            arr[i] = arr[0] + i;
        }
        System.out.print(Arrays.toString(arr));
    }

    public static void multiplyNum() {
        int arr[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        System.out.print(Arrays.toString(arr));
    }

    public static void changeDiagonals() {
        System.out.println("Начальный массив:");
        int arr[][] = new int[5][5];
        final Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(9);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Измененный массив:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
                if ((i + j) == (arr.length - 1)){
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
