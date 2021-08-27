package com.tms.secondTask;

/**
 * Составьте программу, выводящую на экран квадраты чисел от 10 до 20 включительно
 */
public class LessonFiveTwoSixth {
    public static void main(String[] args) {
        int i = 10;
        System.out.println("Квадраты чисел: ");
        while (i < 20) {
            System.out.println(i + "^2 = " + i * i);
            i++;
        }
    }
}
