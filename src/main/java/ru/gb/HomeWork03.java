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
}
