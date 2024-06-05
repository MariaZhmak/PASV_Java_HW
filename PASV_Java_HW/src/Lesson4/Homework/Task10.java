package Lesson4.Homework;

import java.util.Scanner;

public class Task10 {
    /*
    Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию).
     */

    /*
    @Pavlo FIXME: Решение верно
    */
    public static void main(String[] args) {

        int num = 10;
        int factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial *= i;

        }

        System.out.println("Factorial " + num + " = " + factorial);
        while (num < 15) {
            num++;
            factorial = factorial * num;

            System.out.println("Factorail " + num + " = " + factorial);
        }

    }


}
