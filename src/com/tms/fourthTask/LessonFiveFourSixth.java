package com.tms.fourthTask;

import java.util.Scanner;

/**
 * Создайте массив и заполниет массив.
 * Выведите массив на экран в строку.
 * Замените каждый элемент с нечётным индексом на ноль.
 * Снова выведете массив на экран на отдельной строке.
 */
public class LessonFiveFourSixth {
    public static void main(String[] args) {
        System.out.println("Введите число элементов: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] system = new int[num];
        for (int i = 0; i < system.length; i++) {
            system[i] = ((int) (Math.random() * 10));
            System.out.printf(String.valueOf(system[i]) + " ");
        }
        System.out.println("");
        for (int i = 0; i < system.length; i++) {
            if (i % 2 == 0) {
                system[i] = 0;
            }
            System.out.printf(String.valueOf(system[i]) + " ");
        }
    }
}
