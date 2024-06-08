package Lesson5.Homework;

import java.util.Random;

public class Task13 {
    /*
    Создать последовательность случайных чисел, найти и вывести наибольшее из них.
     */

    public static void main(String[] args) {

        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int)(Math.random() * 50);

            System.out.print(nums[i] + ", ");
        }
        System.out.println();

        int length = nums.length;
        int highestNum = nums [0];
        for (int num : nums) {
            if (highestNum < num) {
                highestNum = num;
            }
        }
        System.out.println("The highest number in the array is: " + highestNum);

    }
}
