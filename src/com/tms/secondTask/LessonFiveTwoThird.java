package com.tms.secondTask;

import java.util.Scanner;

/**
 * Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует все числа от 1 до введенного пользователем числа.
 * Для ввода числа воспользуйтесь классом Scanner.
 */
public class LessonFiveTwoThird {
    public static void main(String[] args) {
        System.out.println("Введите последнее число: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int i = 1;
        int result = 0;
        while (i <= num) {
            result += i;
            i++;
        }
        System.out.println(result);
    }
}
