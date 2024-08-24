package Lesson4.Homework;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Task12 {
    /*
     Найдите сумму первых n целых чисел, которые делятся на 3.
     */
    /*
    @Pavlo FIXME: Решение не верно.
            Задача подразумевает сумму чисел в количестве n, которые делятся на 3
            Данный код суммирует числа которые делятся на 3 от 1 до n.
            Если n == 3 код должен вернуть сумму 3 + 6 + 9
    */
    // todo Решение задачи скорректировано
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int sum = 0;
        int num;

        System.out.println("Enter any positive integer: ");
        num = console.nextInt();

        for (int i = 1; i <= (num*3); i++) {
            if (i % 3 == 0) {
                sum += i;
            }
          }
        System.out.println("Sum of numbers that divide by 3: " + sum);
    }
}