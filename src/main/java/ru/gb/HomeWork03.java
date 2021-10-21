package ru.gb;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

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

        System.out.println();
        System.out.println("----------------------------");
        System.out.println("Задание №5");
        System.out.println("----------------------------");
        secondArgs(5, 15);

        System.out.println();
        System.out.println("----------------------------");
        System.out.println("Задание №6");
        System.out.println("----------------------------");
        maxMinNumbers();

        System.out.println();
        System.out.println("----------------------------");
        System.out.println("Задание №7");
        System.out.println("----------------------------");
        int arr1[] = {2, 2, 2, 1, 2, 2, 10, 1};
        int arr2[] = {2, 2, 0, 1, 2, 2, 1, 1, 2};
        System.out.println(Arrays.toString(arr1));
        System.out.println(sumArray(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(sumArray(arr2));

        System.out.println();
        System.out.println("----------------------------");
        System.out.println("Задание №8");
        System.out.println("----------------------------");
        //int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};  не смогла разобраться как на вход в метод offsetArr передать массив
        //System.out.println(Arrays.toString(arr));
        //System.out.println(offsetArr(arr, 3));
        offsetArr();

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
            if (arr[i] == 0) {
                arr[i] = 1;
            } else arr[i] = 0;
        }
        System.out.print(Arrays.toString(arr));

    }

    public static void arrayInt() {
        int arr[] = new int[100];
        for (int i = 0; i < arr.length; i++) {
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
                if ((i == j) || ((i + j) == (arr.length - 1))) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void secondArgs(int len, int initialValue) {
        int arr[] = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        System.out.print(Arrays.toString(arr));
    }

    public static void maxMinNumbers() {
        final Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int len = scanner.nextInt();
        int arr[] = new int[len];
        System.out.println("Введите диапазон значений массива: ");
        int numbers = scanner.nextInt();
        for (int i = 0; i < len; i++) {
            arr[i] = random.nextInt(numbers);
        }
        System.out.println(Arrays.toString(arr));
        int max = arr[0];
        int min = arr[len - 1];
        for (int i = 0; i < len; i++) {
            if (max <= arr[i]) {
                max = arr[i];
            } else if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Максимальный элемент массива = " + max + "\nМинимальный элемент массива = " + min);
    }

    public static boolean sumArray(int arr[]) {
        int leftSum;
        int rightSum;
        for (int i = 0; i < arr.length; i++) {
            leftSum = 0;
            rightSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum += arr[j];
            }
            for (int j = i; j < arr.length; j++) {
                rightSum += arr[j];
            }
            if (rightSum == leftSum) return true;
        }
        return false;

    }

    public static void offsetArr() {
        final Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int len = scanner.nextInt();
        int arr[] = new int[len];
        System.out.println("Введите количество элементов для переноса: ");
        int changeArr = scanner.nextInt();
        for (int i = 0; i < len; i++) {
            arr[i] = random.nextInt(40);
        }
        System.out.println(Arrays.toString(arr));
        int bubble, bubble2;
        if (changeArr > 0) {
            for (int j = 0; j < changeArr; j++) {
                bubble2 = arr[0];
                for (int i = 0; i < arr.length; i++) {
                    if ((i + 1) > (len - 1)) {
                        bubble = arr[i + 1 - len];
                        arr[i + 1 - len] = bubble2;
                        bubble2 = bubble;
                    } else {
                        bubble = arr[i + 1];
                        arr[i + 1] = bubble2;
                        bubble2 = bubble;
                    }
                }
            }
        } else {
            for (int j = changeArr; j < 0; j++) {
                bubble2 = arr[0];
                for (int i = arr.length; i > 0; i--) {
                    if ((i - 1) < 0) {
                        bubble = arr[arr.length - 1];
                        arr[arr.length - 1] = bubble2;
                        bubble2 = bubble;
                    } else {
                        bubble = arr[i - 1];
                        arr[i - 1] = bubble2;
                        bubble2 = bubble;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
