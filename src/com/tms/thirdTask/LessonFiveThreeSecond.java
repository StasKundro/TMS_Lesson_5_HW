package com.tms.thirdTask;

import java.util.Scanner;

/**
 * За каждый месяц банк начисляет к сумме вклада 7% от суммы. Напишите программу,
 * в которую пользователь вводит сумму вклада и количество месяцев. А банк вычисляет
 * конечную сумму вклада с учетом начисления процентов за каждый месяц.
 * Для вычисления суммы с учетом процентов используйте цикл for.
 * Пусть сумма вклада будет представлять тип float.
 */
public class LessonFiveThreeSecond {
    public static void main(String[] args) {
        System.out.println("Введите сумму вклада: ");
        Scanner scanner = new Scanner(System.in);
        float sum = scanner.nextFloat();
        System.out.println("Введите число месяцев: ");
        int num = scanner.nextInt();
        for (int i = 0; i < num; i++) {
            sum *= 1.07;
        }
        System.out.println("Итоговая сумма : " + sum + "$");
    }
}
