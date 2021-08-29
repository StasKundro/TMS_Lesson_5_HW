package com.tms.fifthTask;

import java.util.Scanner;

/**
 * Создать трехмерный массив из целых чисел. С помощью циклов "пройти"
 * по всему массиву и увеличить каждый элемент на заданное число.
 * Пусть число, на которое будет увеличиваться каждый элемент, задается из консоли.
 */
public class LessonFiveFiveFirst {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[][][] system = {
                {
                        {2, 4, 3},
                        {4, 2, 6}
                },
                {
                        {6, 4, 3},
                        {8, 4, 2}
                }
        };
        for (int[][] array2D : system) {
            for (int[] array1D : array2D) {
                for (int item : array1D) {
                    item += num;
                    System.out.printf(String.valueOf(item) + " ");
                }
            }
        }

    }
}
