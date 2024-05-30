package Lesson4.Homework;

import java.util.Random;
import java.util.Scanner;

public class Task12 {
    /*
    Найдите сумму первых n целых чисел, которые делятся на 3.
     */

    public static void main(String[] args) {

        // Read the input.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Loop over the first n even numbers.
        int sum = 0;
        int count = 0;
        while (count < n) {
            int number = 1;

            // If the number is divisible by 3, then add to the running sum.
            if (n % 3 == 0) {
                sum += n;
            }

            count++;
        }

        // Print the output.
        System.out.println(sum);
    }
}


//        Random random = new Random();
//        int n = random.nextInt();
//
//        int firstNum = n / 1000;
//        int secondNum = n / 100 % 10;
//        int thirdNum = n % 100 / 10;
//        int fourthNum = n % 10;

//        while (firstNum< 100 || secondNum < 100) {
//            if (firstNum % 3 == 0 && secondNum % 3 == 0) break;
//                firstNum ++;
//                int sum = firstNum + secondNum;
//            System.out.println(firstNum);
//            }


//        if (firstNum % 3 == 0) {
//            } else if (secondNum % 3 ==0) {
//            int sum = (firstNum + secondNum);
//            System.out.println("Сумма первых чисел равна" + sum);
//        } else {
//            System.out.println("Первые числа не делятся на 3");
//        }




