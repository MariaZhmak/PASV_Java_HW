package Lesson4.Homework;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Task12 {
    /*
     Найдите сумму первых n целых чисел, которые делятся на 3.
     */

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int sum = 0;
        int num;

        System.out.println("Enter any positive integer: ");
        num = console.nextInt();

        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
          }
        System.out.println("Sum of numbers that divide by 3: " + sum);
    }
}