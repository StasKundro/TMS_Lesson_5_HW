package com.tms.firstTask;

import java.util.Scanner;

/**
 * По введенному номеру определить цвет радуги (1 –
 * красный, 4 – зеленый и т. д.)
 */
public class LessonFiveFifth {
    public static void main(String[] args) {
        System.out.println("Введите номер: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        switch (num){
            case 1:
                System.out.println("Красный");
                break;
            case 2:
                System.out.println("Оранжевый");
                break;
            case 3:
                System.out.println("Желтый");
                break;
            case 4:
                System.out.println("Зеленый");
                break;
            case 5:
                System.out.println("Голубой");
                break;
            case 6:
                System.out.println("Синий");
                break;
            case 7:
                System.out.println("Фиолетовый");
                break;
            default:
                System.out.println("Такого цвета нет");
                break;
        }
    }
}
