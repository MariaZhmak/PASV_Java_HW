package Lesson3.Homework;

import java.util.Scanner;

public class Task6 {
    /*
    Создайте число.
    Определите, является ли число трехзначным.
    Определите, является ли его последняя цифра семеркой.
    Определите, является ли число четным.
     */

    /*
    @Pavlo FIXME: Решение не верно.
            Проверка myNum / 100 == 0 не корректно определяет, что число является трехзначным.
            Это условие будет истинным для чисел от 0 до 99.
            Трехзначное число лежит в диапазоне от 100 до 999.
            Остальное верно.
    */
    public static void main(String[] args) {

        System.out.println("Enter any number:");
        Scanner scanner = new Scanner(System.in);
        int myNum = scanner.nextInt();

        if (myNum / 100 == 0) {
            System.out.println(myNum + " is not three-digit number");
        } else {
            System.out.println(myNum + " is a three-digit number");
        }

        if (myNum % 10 == 7) {
            System.out.println(myNum + " contains the last digit 7");
        } else {
            System.out.println(myNum + " does not contain the last digit 7");
        }

        if (myNum % 2 == 0) {
            System.out.println(myNum + " is even");
            } else {
            System.out.println(myNum + " is odd");
        }

    }
}
