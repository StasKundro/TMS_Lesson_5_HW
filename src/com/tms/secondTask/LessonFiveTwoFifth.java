package com.tms.secondTask;

/**
 * Вывести 10 первых чисел последовательности 0, -5,-10,-15..
 */
public class LessonFiveTwoFifth {
    public static void main(String[] args) {
        int i = 0;
        int result = 0;
        while (i < 10) {
            i++;
            System.out.println(result);
            result -=5;
        }
    }
}