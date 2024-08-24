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
    /*
    @Pavlo FIXME: Решение верно.
            Для более аккуратного и форматированного вывода данных в консоль Java,
                мы можем использовать метод printf из класса System.out
            System.out.printf("Задание А): %d минут %d секунд%n", totalMinutes, leftSeconds);
            System.out.printf("Задание B): %d часов %d минут %d секунд%n", totalHours, leftMinutes, leftSeconds);
            System.out.printf("Задание C): %d дней %d часов %d минут %d секунд%n", totalDays, leftHours, leftMinutes, leftSeconds);
            System.out.printf("Задание D): %d недель %d дней %d часов %d минут %d секунд%n", totalWeeks, leftDays, leftHours, leftMinutes, leftSeconds);
                %d — десятичное целое число
                %n — перенос строки
    */
    // todo Решение задачи скорректировано
    public static void main(String[] args) {
//        int s = 4500;
//        int sec =  s % 60;
//        int m = (s - sec) / 60;
//        int min = m % 60;
//        int h = (m - min) / 60;
//        int hours = h % 24;
//        int d = (h - hours) / 24;
//        int days = d % 7;
//        int w = (d - days) / 7;
//        System.out.println(m + " minutes " + sec + " seconds");
//        System.out.println(h + " hours " + min + " minutes " + sec + " seconds ");
//        System.out.println(d + " days " + hours + " hours " + min + " minutes " + sec + " seconds ");
//        System.out.println(w + " week " + days + " days " + hours + " hours " + min + " minutes " + sec + " seconds ");

        int totalSeconds = 4500;
        int leftSeconds = totalSeconds % 60;
        int totalMinutes = (totalSeconds - leftSeconds) / 60;
        int leftMinutes = totalMinutes % 60;
        int totalHours = (totalMinutes - leftMinutes) / 60;
        int leftHours = totalHours % 24;
        int totalDays = (totalHours - leftHours) / 24;
        int leftDays = totalDays % 7;
        int totalWeeks = (totalDays - leftDays) / 7;

        System.out.printf("Задание А: %d minutes %d seconds%n", totalMinutes, leftSeconds);
        System.out.printf("Задание В: %d hours %d minutes %d seconds%n", totalHours, leftMinutes, leftSeconds);
        System.out.printf("Задание С: %d days %d hours %d minutes %d seconds%n", totalDays, leftHours, leftMinutes, leftSeconds);
        System.out.printf("Задание D: %d weeks %d days, %d hours, %d minutes, %d seconds%n", totalWeeks, leftDays, leftHours, leftMinutes, leftSeconds);


    }

}
