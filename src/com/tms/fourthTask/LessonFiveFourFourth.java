package com.tms.fourthTask;

/**
 * Создайте 2 массива из 5 чисел.
 * Выведите массивы на консоль в двух отдельных строках.
 * Посчитайте среднее арифметическое элементов каждого массива и сообщите,
 * для какого из массивов это значение оказалось больше
 * (либо сообщите, что их средние арифметические равны)
 */
public class LessonFiveFourFourth {
    public static void main(String[] args) {
        int[] system1 = new int[5];
        int[] system2 = new int[5];
        int sr1 = 0;
        int sr2 = 0;
        float result1 = 0;
        float result2 = 0;
        System.out.println("Массив 1:");
        for (int i = 0; i < system1.length; i++) {
            system1[i] = ((int) (Math.random() * 10));
            sr1 += system1[i];
            System.out.printf(String.valueOf(system1[i]) + " ");
        }
        System.out.println(" ");
        System.out.println("Массив 2:");
        for (int i = 0; i < system2.length; i++) {
            system2[i] = ((int) (Math.random() * 10));
            sr2 += system2[i];
            System.out.printf(String.valueOf(system2[i]) + " ");
        }
        result1 = sr1 / 2;
        result2 = sr2 / 2;
        System.out.println("");
        if (result1 > result2) {
            System.out.println("Среднее арифметическое первого массива больше : " + result1 + " > " + result2);
        } else if (result1 < result2) {
            System.out.println("Среднее арифметическое второго массива больше : " + result1 + " < " + result2);
        } else {
            System.out.println("Средние арифметические массивов равны : " + result1 + " = " + result2);
        }
    }
}
