package com.tms.fourthTask;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Создайте массив строк. Заполните его произвольными именами людей.
 * Отсортируйте массив.
 * Результат выведите на консоль.
 */
public class LessonFiveFourSeventh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] system = new String[3];
        for (int i = 0; i < system.length; i++) {
            System.out.println("Введите имя: ");
            String name = scanner.nextLine();
            system[i] = name;
        }
        Arrays.sort(system);
        for (int i = 0; i < system.length; i++) {
            System.out.println(system[i]);
        }
    }
}
