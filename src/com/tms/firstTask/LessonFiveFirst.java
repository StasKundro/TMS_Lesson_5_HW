package com.tms.firstTask;

import java.util.Scanner;

/**
 * Написать программу для вывода названия поры года по номеру месяца.
 * При решении используйте оператор switch-case.
 */
public class LessonFiveFirst {
    public static void main(String[] args) {
        System.out.println("Введите номер месяца: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        switch (num) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
            default:
                System.out.println("акого месяца не существует");
                break;
        }
    }
}
