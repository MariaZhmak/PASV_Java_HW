package Lesson4.Homework;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number. ---> ");
        int num = scanner.nextInt();
        boolean temp = true;
        if (num == 0 || num == 1) {
            temp = false;
            ;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                temp = false;
                break;
            }
        }
        if (temp != true) {
            System.out.println(num + " is not a prime number");
        } else {
            System.out.println(num + " is a prime number");
        }
    }
}