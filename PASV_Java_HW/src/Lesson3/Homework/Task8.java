package Lesson3.Homework;

import java.util.Random;

public class Task8 {

    /*
    Имеется целое число (задать с помощью Random rand = new Random();
    int x = rand.nextInt() ). Это число – количесво денег в рублях.
    Вывести это число, добавив к нему слово «рублей» в правильном падеже.
     */

    /*
    @Pavlo FIXME: Решение не верно для чисел 11-14
            нужно учитывать исключения для данных чисел
    */
    public static void main(String[] args) {

        Random random = new Random();
        int x = random.nextInt();

        if (x % 10 == 1) {
            System.out.println(x + " рубль");
        } else if (x % 10 == -1) {
            System.out.println(x + " рубль");
        } else if (x % 10 == 2 || x % 10 == 3 || x % 10 == 4) {
            System.out.println(x + " рубля");
        } else if (x % 10 == -2 || x % 10 == -3 || x % 10 == -4) {
            System.out.println(x + " рубля");
        } else {
            System.out.println(x + " рублей");
        }



    }

}
