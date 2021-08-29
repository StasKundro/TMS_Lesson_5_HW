package com.tms.fourthTask;

import java.util.Scanner;

/**
 * Создайте массив целых чисел. Напишете программу,
 * которая выводит сообщение о том,
 * входит ли заданное число в массив или нет.
 */
public class LessonFiveFourFirst {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        boolean x = false;
        int[] system = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < system.length; i++) {
            if (system[i] == num) {
                x = true;
            }
        }
        if (x == true) {
            System.out.println("Такое число есть");
        } else {
            System.out.println("Такого числа нет");
        }
    }
}
