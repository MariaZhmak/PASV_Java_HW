package Lesson5.Homework;

import java.util.Random;

public class Task15 {
    /*
    Создать массив, заполнить его случайными элементами, распечатать, перевернуть,
    и снова распечатать (при переворачивании нежелательно создавать еще один массив).

     */

    public static void main(String[] args) {

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20);

            System.out.print(array[i] + "  ");
        }
        System.out.println();

            int length = array.length;
            int temp;

        for (int i = 0; i < length / 2; i++) {
            temp = array[i];
            array[i] = array[length - i - 1];
            array[length - i - 1] = temp;
        }
        for (int element : array) {
            System.out.print(element + "  ");

        }


            }
        }






