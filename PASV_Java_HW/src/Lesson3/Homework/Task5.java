package Lesson3.Homework;

import java.util.Arrays;
import java.util.Scanner;

public class Task5 {

    // Дано любое натуральное 4-х значное число. Верно ли, что все цифры числа различны?
    /*
    @Pavlo FIXME: Решение верно.
            Оператор или можно использовать много раз в одном if
            if (firstNum == secondNum || firstNum == thirdNum || firstNum == fourthNum ||
            secondNum == thirdNum || secondNum == fourthNum || thirdNum == fourthNum)
            Придумайте алгоритм сравнения всех чисел со всеми используя вложенные циклы
    */

    public static boolean areAllDigitsDifferent(int number) {
        // Convert the number to a string
        String numberStr = String.valueOf(number);

        // Nested loops to compare each digit with every other digit
        for (int i = 0; i < numberStr.length(); i++) {
            for (int j = i + 1; j < numberStr.length(); j++) {
                if (numberStr.charAt(i) == numberStr.charAt(j)) {
                    return false;
                }
            }
        }
        // If no duplicates are found, return true
        return true;
    }

    public static void main(String[] args) {
        System.out.print("Enter any 4-digit number...");
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();

        boolean result = areAllDigitsDifferent(number);
        if (result) {
            System.out.println("Yes, all the numbers are different");
        } else {
            System.out.println("No, there are identical numbers");

        }
    }

//    public static void main(String[] args) {
//
//        System.out.println("Enter any 4-digit number...");
//
//        Scanner scanner = new Scanner(System.in);
//        int natNum = scanner.nextInt();
//
//        int firstNum = natNum / 1000;
//        int secondNum = natNum / 100 % 10;
//        int thirdNum = natNum % 100 / 10;
//        int fourthNum = natNum % 10;
//
//        if (firstNum == secondNum || thirdNum == fourthNum) {
//            System.out.println("No, there are identical numbers");
//        } else if (firstNum == thirdNum || secondNum == fourthNum) {
//            System.out.println("No, there are identical numbers");
//        } else if (firstNum == fourthNum || secondNum == thirdNum) {
//            System.out.println("No, there are identical numbers");
//        } else {
//            System.out.println("Yes, all the numbers are different");
//        }
//    }

}

