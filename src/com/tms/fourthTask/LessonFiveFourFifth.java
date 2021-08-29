package com.tms.fourthTask;

import java.util.Scanner;

/**
 * Если пользователь ввёл не подходящее число, то программа должна просить пользователя повторить ввод.
 * Создайте массив из n случайных целых чисел и выведите его на экран.
 * Размер массива пусть задается с консоли и размер массива может быть больше 5 и меньше или равно 10.
 * Если n не удовлетворяет условию - выведите сообщение об этом.
 * Создайте второй массив только из чётных элементов первого массива, если они там есть, и вывести его на экран.
 */
public class LessonFiveFourFifth {
    public static void main(String[] args) {
        System.out.println("Введите число элементов: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] system = new int[num];
        if (num > 5 && num <= 10) {
            for (int i = 0; i < system.length; i++) {
                system[i] = ((int) (Math.random() * 10));
                System.out.printf(String.valueOf(system[i]) + " ");
            }
            System.out.println("\nМассив из четный чисел : ");
            for (int i = 0; i < system.length; i++) {
                if (system[i] != 0)
                    if (system[i] % 2 == 0) {
                        System.out.printf(String.valueOf(system[i]) + " ");
                    }
            }
        } else {
            System.out.println("Число не удовлетворяет условию");
        }

    }
}
