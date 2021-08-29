package com.tms.fifthTask;

/**
 * Шахматная доска  Создать программу для расскаски шахматной доски с помощю цикла.
 * Создать двумерный массив String'ов 8х8.
 * С помощью циклов задать элементам циклам значения B(Black) или W(White).
 * for (int i = 0; i < system.length; ++i) {
 * for (int j = 0; j < system[i].length; ++j) {
 * if (i % 2 != 0 && j % 2 != 0) {
 * system[i][j] = "B";
 * }
 * if (i % 2 == 0 && j % 2 == 0) {
 * system[i][j] = "W";
 * }
 * if (i % 2 == 0 && j % 2 != 0) {
 * system[i][j] = "B";
 * }
 * if (i % 2 != 0 && j % 2 == 0) {
 * system[i][j] = "W";
 * }
 * System.out.printf(String.valueOf(system[i][j]) + " ");
 * }
 * }
 */
public class LessonFiveFiveSecond {
    public static void main(String[] args) {
        String[][] system = new String[8][8];
        for (int i = 0; i < system.length; ++i) {
            if (i % 2 == 0) {
                for (int j = 0; j < system[i].length; ++j) {
                    if (i % 2 != 0 && j % 2 != 0) {
                        system[i][j] = "B";
                    }
                    if (i % 2 == 0 && j % 2 == 0) {
                        system[i][j] = "W";
                    }
                    if (i % 2 == 0 && j % 2 != 0) {
                        system[i][j] = "B";
                    }
                    if (i % 2 != 0 && j % 2 == 0) {
                        system[i][j] = "W";
                    }
                    System.out.printf(String.valueOf(system[i][j]) + " ");
                }
                System.out.println("");
            } else {
                for (int j = 0; j < system[i].length; ++j) {
                    if (i % 2 != 0 && j % 2 != 0) {
                        system[i][j] = "W";
                    }
                    if (i % 2 == 0 && j % 2 == 0) {
                        system[i][j] = "B";
                    }
                    if (i % 2 == 0 && j % 2 != 0) {
                        system[i][j] = "W";
                    }
                    if (i % 2 != 0 && j % 2 == 0) {
                        system[i][j] = "B";
                    }
                    System.out.printf(String.valueOf(system[i][j]) + " ");
                }
                System.out.println("");
            }
        }


    }
}
