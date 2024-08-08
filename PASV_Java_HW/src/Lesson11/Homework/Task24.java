package Lesson11.Homework;

public class Task24 {
    /*
    Создать класс и объекты описывающие промежуток времени. Сам промежуток в классе
    должен задаваться тремя свойствами: секундами, минутами, часами.
    Сделать методы для получения полного количества секунд в объекте, сравнения двух
    объектов (метод должен работать аналогично compareTo в строках). Создать два
    конструктора: получающий общее количество секунд, и часы, минуты и секунды
    по отдельности. Сделать метод для вывода данных.
     */

    public static class TimePeriod {

        private final int hours;
        private final int minutes;
        private final int seconds;

        public TimePeriod(int totalSeconds) {
            this.hours = totalSeconds / 3600;
            this.minutes = (totalSeconds % 3600) / 60;
            this.seconds = totalSeconds % 60;
        }

        public TimePeriod(int hours, int minutes, int seconds) {
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
        }

        public int getTotalSeconds() {
            return hours * 3600 + minutes * 60 + seconds;
        }

        public int compareTo(TimePeriod other) {
            return Integer.compare(this.getTotalSeconds(), other.getTotalSeconds());
        }

        public void display() {
            System.out.printf("%02d:%02d:%02d\n", hours, minutes, seconds);
        }

        public static void main(String[] args) {
            TimePeriod period1 = new TimePeriod(3661);
            TimePeriod period2 = new TimePeriod(1, 1, 1);

            period1.display();
            period2.display();

            System.out.println(period1.getTotalSeconds());
            System.out.println(period2.getTotalSeconds());

            System.out.println(period1.compareTo(period2));
        }

    }
}
