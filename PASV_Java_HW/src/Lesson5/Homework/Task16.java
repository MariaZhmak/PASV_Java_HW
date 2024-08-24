package Lesson5.Homework;

import java.util.Arrays;

public class Task16 {
    /*
    Определите сумму элементов одномерного массива, расположенных между
    минимальным и максимальным значениями.
     */

    /*
    @Pavlo FIXME: Решение верно. Есть ошибка.
            Задача требует найти сумму элементов массива, расположенных между минимальным и максимальным значениями, не включая сами эти значения.
    */
    // todo Решение задачи скорректировано

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

        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }
        int sum = 0;
        for (int i = Math.min(maxIndex, minIndex) + 1; i < Math.max(maxIndex, minIndex); i++) {
            sum += array[i];

//
//            int sum = 0;
//            for (int j : array) {
//                sum += j;
            }
            System.out.println("Sum of array elements: " + sum);

        }


    }

