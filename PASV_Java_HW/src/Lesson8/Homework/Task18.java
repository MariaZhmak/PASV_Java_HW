package Lesson8.Homework;

public class Task18 {
    /*
    Найти в строке не только запятые, но и другие знаки препинания.
    Подсчитать общее их количество.
     */
    public static void main(String[] args) {

// Добавлены еще знаки препинатия ; : !?
        String str = "Строковый литерал - это последовательность символов, заключенных в двойных кавычках.; : !?";
        int n = 0;
        char symbol;

        for (
                int i = 0; i < str.length(); i++) {
            symbol = str.charAt(i);

            if (symbol == ',' || symbol == '.' || symbol == ';' ||  symbol == ':' ||  symbol == '!' ||  symbol == '?' ) {
                n++;
            }
        }
        System.out.println("Общее количество знаков препинания в тексте - " + n);

    }
}
