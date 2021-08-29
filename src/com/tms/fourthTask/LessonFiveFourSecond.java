package com.tms.fourthTask;

import java.util.Scanner;

/**
 * Создайте массив целых чисел. Удалите все вхождения заданного числа из массива.
 * Пусть число задается с консоли (класс Scanner).
 * Если такого числа нет - выведите сообщения об этом.
 * В результате должен быть новый массив без указанного числа.
 */
public class LessonFiveFourSecond {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int j;
        int[] system = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int z = system.length;
        System.out.println("Старый массив:");
        for (j = 0; j < z; j++)
            System.out.print(system[j] + " ");
        System.out.println("");

        for (j = 0; j < z; j++)
            if (system[j] == num)
                break;
        for (int k = j; k < z - 1; k++)
            system[k] = system[k + 1];
        z--;
        System.out.println("Новый массив:");
        for (j = 0; j < z; j++)
            System.out.print(system[j] + " ");
        System.out.println("");
    }
}
