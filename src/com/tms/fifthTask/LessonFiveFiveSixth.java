package com.tms.fifthTask;

/**
 * Создайте двумерный массив целых чисел.
 * Отсортируйте элементы в строках двумерного массива по возрастанию.
 */
public class LessonFiveFiveSixth {
    public static void main(String[] args) {
        int[][] system = {
                {5, 4, 4, 9},
                {7, 5, 2, 8},
                {2, 5, 7, 1}
        };
        for (int r = 0; r < system.length; ++r) {
            for (int c = 0; c < system[r].length; ++c) {
                int z = c + 1;
                for (int x = r; x < system.length; ++x) {
                    while (z < system[x].length) {
                        if (system[x][z] < system[r][c]) {
                            int tmp = system[r][c];
                            system[r][c] = system[x][z];
                            system[x][z] = tmp;
                        }
                        ++z;
                    }
                    z = 0;
                }
            }
        }
        for (int i = 0; i < system.length; ++i)
            System.out.println(java.util.Arrays.toString(system[i]));
    }
}
