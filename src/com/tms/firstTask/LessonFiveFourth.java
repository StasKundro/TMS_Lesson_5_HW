package com.tms.firstTask;

import java.util.Scanner;

/**
 * Для введенного числа t (температура на улице) вывести
 * Если t>–5, то вывести «Тепло».
 * Если –5>= t > –20, то вывести «Нормально».
 * Если –20>= t, то вывести «Холодно».
 */
public class LessonFiveFourth {
    public static void main(String[] args) {
        System.out.println("Введите температуру: ");
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        if (t > -5) {
            System.out.println("Тепло");
        } else if (t < -5 && t > -20) {
            System.out.println("Нормально");
        } else if (t < -20) {
            System.out.println("Холодно");
        }
    }
}
