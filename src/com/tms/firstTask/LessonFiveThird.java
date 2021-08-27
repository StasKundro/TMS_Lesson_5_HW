package com.tms.firstTask;

import java.util.Scanner;

/**
 * Напишите программу которая будет принимать на вход число и на выход
 * будет выводить сообщение четное число или нет.
 */
public class LessonFiveThird {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num % 2 != 0) {
            System.out.println(num + " - нечетное");
        } else {
            System.out.println(num + " - четное");
        }
    }
}

