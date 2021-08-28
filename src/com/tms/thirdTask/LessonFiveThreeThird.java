package com.tms.thirdTask;

import java.util.Scanner;

/**
 * Напишите программу, которая выводит на консоль таблицу умножения
 */
public class LessonFiveThreeThird {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Размер таблицы по вертикали - ");
        int x = scanner.nextInt();
        System.out.print("Размер таблицы по горизонтали - ");
        int y = scanner.nextInt();
        for (int i = 1; i < x + 1; i++) {
            for (int k = 1; k < y + 1; k++) {
                System.out.printf("%4d", (k * i));
            }
            System.out.println("");
        }
    }
}
