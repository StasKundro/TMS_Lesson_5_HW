package com.tms.thirdTask;

/**
 * Выведите на экран первые 11 членов последовательности Фибоначчи
 */
public class LessonFiveThreeFirst {
    public static void main(String[] args) {
        int x = 0;
        int y = 1;
        int result = 0;
        System.out.println(x);
        result = x + y;
        System.out.println(result);
        for (int i = 3; i <= 11; i++) {
            result = x + y;
            x = y;
            y = result;
            System.out.println(result);
        }
    }
}
