package Lesson5.Homework;

import java.util.Arrays;
import java.util.Enumeration;

public class Task16 {
    /*
    Определите сумму элементов одномерного массива, расположенных между
    минимальным и максимальным значениями.
     */

    public static void main(String[] args) {

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20);

            System.out.print(array[i] + ",  ");
        }
        System.out.println();

            Arrays.sort(array);
            for (int num : array) {
                System.out.print(num + ",  ");

            }
            System.out.println();


            int sum = 0;
            for (int j : array) {
                sum += j;
            }
            System.out.println("Sum of array elements: " + sum);

        }


    }

