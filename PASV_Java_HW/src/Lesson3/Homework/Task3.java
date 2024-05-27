package Lesson3.Homework;

public class Task3 {
    /*
    Имеется 4500 секунд. Вывести в консоль содержащихся в этом количестве секунд:
    А) минут + секунд,
    В) часов + минут + секунд,
    С) дней + часов + минут + секунд,
    D) недель + дней + часов + минут + секунд.
    по аналогии с примером выше.
     */

    public static void main(String[] args) {
        int s = 4500;
        int sec =  s % 60;
        int m = (s - sec) / 60;
        int min = m % 60;
        int h = (m - min) / 60;
        int hours = h % 24;
        int d = (h - hours) / 24;
        int days = d % 7;
        int w = (d - days) / 7;
        System.out.println(m + " minutes " + sec + " seconds");
        System.out.println(h + " hours " + min + " minutes " + sec + " seconds ");
        System.out.println(d + " days " + hours + " hours " + min + " minutes " + sec + " seconds ");
        System.out.println(w + " week " + days + " days " + hours + " hours " + min + " minutes " + sec + " seconds ");

    }

}
