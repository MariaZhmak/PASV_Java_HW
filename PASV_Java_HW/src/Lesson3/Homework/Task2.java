package Lesson3.Homework;

import java.util.Scanner;

public class Task2 {
    /*
    Изменить данный пример так, что бы при запуске программы ваша программа
    выводила следующее: “Hello, <Ваше имя>!”
     */
    /*
    @Pavlo FIXME: Решение верно
    */
    public static void main(String[] args) {
        System.out.println("Enter your name...");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
