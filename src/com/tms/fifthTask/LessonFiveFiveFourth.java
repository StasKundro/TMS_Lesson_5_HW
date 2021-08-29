package com.tms.fifthTask;

/**
 * Создайте двумерный массив целых чисел.Выведите на консоль сумму всех элементов массива.
 */
public class LessonFiveFiveFourth {
    public static void main(String[] args) {
        int[][] system = {{1, 5, 3}, {2, 5, 6}, {2, 9, 4}};
        int x = 0;
        for (int i = 0; i < system.length; ++i) {
            for (int j = 0; j < system[i].length; ++j) {
                x += system[i][j];
                System.out.printf(String.valueOf(system[i][j]) + " ");
            }
        }
        System.out.println("\nСумма = " + x);
    }
}
