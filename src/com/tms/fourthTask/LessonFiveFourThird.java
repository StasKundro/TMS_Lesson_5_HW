package com.tms.fourthTask;

import java.util.Scanner;

/**
 * Создайте и заполните массив случайным числами и выведете максимальное, минимальное и среднее значение.
 * Для генерации случайного числа используйте метод Math.random().
 * Пусть будет возможность создавать массив произвольного размера.
 * Пусть размер массива вводится с консоли.
 */
public class LessonFiveFourThird {
    public static void main(String[] args) {
        System.out.println("Введите число элементов: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] system = new int[num];
        for (int i = 0; i < system.length; i++) {
            system[i] = ((int)(Math.random() * 10));
            System.out.println(system[i]);
        }
        double max = system[0];
        double min = system[0];
        double sr = 0;
        for (int i = 0; i < system.length; i++){
            if (max < system[i])
                max = system[i];
            if (min >system[i])
                min = system[i];
        }
        sr = max / 2;
        System.out.println("Максимум = " + max);
        System.out.println("Минимум = " + min);
        System.out.println("Среднее = " + sr);
    }
}
