package com.tms.secondTask;

/**
 * При помощи цикла for вывести на экран нечетные числа от 1 до 99.
 * При решении используйте оперцию инкремента (++).
 */
public class LessonFiveTwoFirst {
    public static void main(String[] args) {
        System.out.println("Нечетные числа:");
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
