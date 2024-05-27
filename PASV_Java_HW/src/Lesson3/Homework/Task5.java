package Lesson3.Homework;

import java.util.Scanner;

public class Task5 {

    // Дано любое натуральное 4-х значное число. Верно ли, что все цифрв числа различны?

    public static void main(String[] args) {

        int natNum = 6752;
        int firstNum = natNum / 1000;
        int secondNum = natNum / 100 % 10;
        int thirdNum = natNum % 100 / 10;
        int fourthNum = natNum % 10;

        if (firstNum == secondNum || thirdNum == fourthNum) {
            System.out.println("No, there are identical numbers");
        } else if (firstNum == thirdNum || secondNum == fourthNum) {
            System.out.println("No, there are identical numbers");
        } else if (firstNum == fourthNum || secondNum == thirdNum) {
            System.out.println("No, there are identical numbers");
        } else {
            System.out.println("Yes, all the numbers are different");
        }
    }

}
