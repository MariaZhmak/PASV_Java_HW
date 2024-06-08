package Lesson4.Homework;

import java.util.Scanner;

public class Task11 {
    /*
    Имеется целое число, определить является ли это число простым, т.е.
делится без остатка только на 1 и себя.
     */

    /*
    @Pavlo FIXME: Решение верно
    */

    public static void main(String[] args) {

        System.out.println("Enter a number : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }
    }
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

