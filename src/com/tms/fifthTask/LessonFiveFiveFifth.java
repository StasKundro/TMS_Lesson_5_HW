package com.tms.fifthTask;

/**
 * Создайте двумерный массив.  Выведите на консоль диагонали массива.
 */
public class LessonFiveFiveFifth {
    public static void main(String[] args) {
        int[][] system = {{2, 3, 4}, {6, 4, 2}, {9, 3, 7}};
        for (int i = 0; i < system.length; ++i) {
            for (int j = 0; j < system[i].length; ++j) {
                System.out.printf(String.valueOf(system[i][j]) + " ");
            }
            System.out.print("\n");
        }
        System.out.println("\nДиагональ 1: ");
        for (int i = 0; i < 3; ++i) {
            System.out.printf(String.valueOf(system[i][i]) + " ");

        }
        System.out.println("\nДиагональ 2: ");
        for (int i = 2, y = 0; i >= 0; --i) {
            System.out.printf(String.valueOf(system[i][y]) + " ");
            y++;
        }
    }
}
