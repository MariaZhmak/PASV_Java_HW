package Lesson5.Homework;

import java.util.Random;

public class Task13 {
    /*
    Создать последовательность случайных чисел, найти и вывести наибольшее из них.
     */

    public static void main(String[] args) {

        int min = 50;
        int max = 100;

        int random_int1 = (int)Math.floor(Math.random() * (max - min + 1) + min);
        int random_int2 = (int)Math.floor(Math.random() * (max - min + 1) + min);
        int random_int3 = (int)Math.floor(Math.random() * (max - min + 1) + min);

        System.out.println("Sequence of random numbers:\n " + random_int1 + ", " + random_int2 + ", " + random_int3);

        int nums[] = {random_int2, random_int2, random_int3};

        int length = nums.length;
        int highestNum = nums [0];
        for (int num : nums) {
            if (highestNum < num) {
                highestNum = num;
            }
        }
        System.out.println("\nThe highest number in the array is: " + highestNum);


    }


}
