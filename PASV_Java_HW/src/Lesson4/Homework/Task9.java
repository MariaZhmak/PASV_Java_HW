package Lesson4.Homework;

import java.util.Scanner;

public class Task9 {
    /*
    Изменить пример с суммой чисел таким образом, чтобы рассчитывалась не сумма,
    а произведение, т.е. факториал числа
     */
    public static void main(String[] args) {

        int factorial = (int) (Math.random() * 10);
        int mul = 1;

        for (int x = 1; x <= factorial; x++) {
            mul *= x;
        }
        System.out.println("Factorial number " + factorial + " = " + mul);

    }
}
