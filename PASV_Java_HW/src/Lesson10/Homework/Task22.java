package Lesson10.Homework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task22 {
    /*
   Написать программу, выполняющую поиск в строке шестнадцатеричных чисел,
   записаных по правилам Java, с помощью регулярных выражений и вывести их на страницу.
    */
    public static void main(String[] args) {

        String input = "0x1A, 0xFF, 0x123abc, 0XDEAD";

        String hexPattern = "\\b0[xX][0-9a-fA-F]+\\b";

        Pattern pattern = Pattern.compile(hexPattern);
        Matcher matcher = pattern.matcher(input);

        System.out.println("Найденные шестнадцатеричные числа:");
        while (matcher.find()) {

            System.out.println(matcher.group());

        }
    }

}
