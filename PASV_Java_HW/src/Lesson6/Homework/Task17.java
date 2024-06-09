package Lesson6.Homework;

import java.util.Arrays;

public class Task17 {
    /*
    Создать двухмерный квадратный массив, и заполнить его «бабочкой», т.е таким образом:
    1 1 1 1 1
    0 1 1 1 0
    0 0 1 0 0
    0 1 1 1 0
    1 1 1 1 1
     */

    /*
    @Pavlo FIXME: Решение верно.
    */
    public static void main(String[] args) {

        int matrix[][] = new int[5][5];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = 1;

                matrix[1][0] = 0;
                matrix[1][4] = 0;
                matrix[2][0] = 0;
                matrix[2][1] = 0;
                matrix[2][3] = 0;
                matrix[2][4] = 0;
                matrix[3][0] = 0;
                matrix[3][4] = 0;

                System.out.printf("%d ", matrix[i][j]);

            }
            System.out.println();
        }

        // Второй способ

//                for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                matrix[i][j] = 1;
//            }
//        }
////                for (int[] ints : matrix) {
//                    System.out.println();
//                    for (int anInt : ints) {
//
//                        matrix[1][0] = 0;
//                        matrix[1][4] = 0;
//                        matrix[2][0] = 0;
//                        matrix[2][1] = 0;
//                        matrix[2][3] = 0;
//                        matrix[2][4] = 0;
//                        matrix[3][0] = 0;
//                        matrix[3][4] = 0;
//
//                        System.out.print(anInt + " ");
    }
}
