package com.tms.fourthTask;

import java.util.Arrays;

/**
 * Реализуйте алгоритм сортировки пузырьком.
 */
public class LessonFiveFourEighth {
    public static void main(String[] args) {
        int[] mas = {11, 15, 3, 8, 24, 10, 5};
        int x;
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] > mas[i + 1]) {
                    sorted = false;
                    x = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = x;
                }
            }
        }
        System.out.println(Arrays.toString(mas));
    }
}
