package Lesson3.Homework;

import java.util.Random;
import java.util.Scanner;

public class Task4 {
    /*
    Определить число, полученное выписыванием в обратном порядке цифр
    любого 4-х значного натурального числа n.
    */

    /*
    @Pavlo FIXME: Решение верно. Также можно написать алгоритм выписывающий числа в
            обратном направлении
    */
    public static void main(String[] args) {
        System.out.println("Enter any 4-digit number...");

        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int firstNum = n / 1000;
//        int secondNum = n / 100 % 10;
//        int thirdNum = n % 100 / 10;
//        int fourthNum = n % 10;
//
//
//        System.out.println("Result in reverse order: " + fourthNum + thirdNum + secondNum + firstNum);

        int number;
        int reverse = 0;

        number = scanner.nextInt();

        int temp = number;
        int remainder = 0;

        while (temp > 0) {
            remainder = temp % 10;
            reverse = reverse * 10 + remainder;
            temp /= 10;
        }
        System.out.println("Reverse of " + number + " is " + reverse);

    }
}
