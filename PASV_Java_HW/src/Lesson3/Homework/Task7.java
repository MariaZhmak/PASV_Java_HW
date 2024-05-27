package Lesson3.Homework;

import java.util.Scanner;

public class Task7 {

    /*
    Имеется прямоугольное отверстие размерами a и b,
    определить, можно ли его полностью закрыть круглой картонкой радиусом r.
     */

    public static void main(String[] args) {

        System.out.println("Enter the size of side A:");
        int a = new Scanner(System.in).nextInt();

        System.out.println("Enter the size of side B:");
        int b = new Scanner(System.in).nextInt();

        System.out.println("Enter the radius size");
        int r = new Scanner(System.in).nextInt();


        if (r * 2 >= Math.sqrt (a * a + b * b)) {
            System.out.println("Will cover");
        } else {
            System.out.println("Won't cover");
        }

    }
}
