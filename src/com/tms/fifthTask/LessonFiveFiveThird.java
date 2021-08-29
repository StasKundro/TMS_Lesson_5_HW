package com.tms.fifthTask;

/**
 * Умножение двух матриц
 * Создайте два массива целых чисел размером 3х3 (две матрицы).
 * Напишите программу для умножения двух матриц.
 * первый массив: {{1,0,0,0},{0,1,0,0},{0,0,0,0}}
 * втрой массив: {{1,2,3},{1,1,1},{0,0,0},{2,1,0}}
 * Ожидаемый результат:  1  2  3   1  1  1   0  0  0
 */
public class LessonFiveFiveThird {
    public static void main(String[] args) {
        int[][] mA = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        int[][] mB = {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};
        int m = mA.length;
        int n = mB[0].length;
        int o = mB.length;
        int[][] res = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < o; k++) {
                    res[i][j] += mA[i][k] * mB[k][j];
                }
            }
        }
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.format("%4d ", res[i][j]);
            }
            System.out.println();
        }
    }
}
