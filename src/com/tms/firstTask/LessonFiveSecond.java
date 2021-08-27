package com.tms.firstTask;

import java.util.Scanner;

/**
 * Написать программу для вывода названия поры года по номеру месяца.
 * При решении используйте оператор if-else-if
 */
public class LessonFiveSecond {
    public static void main(String[] args) {
        System.out.println("Введите номер месяца: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num == 1 || num == 2 || num == 12) {
            System.out.println("Зима");
        } else if (num == 3 || num == 4 || num == 5) {
            System.out.println("Весна");
        } else if (num == 6 || num == 7 || num == 8) {
            System.out.println("Лето");
        } else if (num == 9 || num == 10 || num == 11) {
            System.out.println("Осень");
        } else {
            System.out.println("Такого месяца не существует");
        }
    }
}
