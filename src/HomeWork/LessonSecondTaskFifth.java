package HomeWork;

import java.util.Arrays;
import java.util.Random;

/**
 Создать двумерный массив из 6 строк по 7 столбцов в каждой из
 случайных целых чисел из отрезка [0;9].
 Вывести массив на экран. Преобразовать массив таким образом,
 чтобы на первом месте в каждой строке стоял её наибольший
 элемент. При этом изменять состав массива нельзя, а можно
 только переставлять элементы в рамках одной строки. Порядок
 остальных элементов строки не важен (т.е. можно совершить
 только одну перестановку, а можно отсортировать по убыванию
 каждую строку). Вывести преобразованный массив на экран.

 */
public class LessonSecondTaskFifth {
    public static void main(String[] args) {
        massiv();
    }

    static void massiv() {
        Random randomGenerator = new Random();

        int[][] massive = new int[6][7];
        for (int i = 0; i < massive.length; i++) {
            for (int j = 0; j < massive[i].length; j++) {
                massive[i][j] = randomGenerator.nextInt(9);
            }
            System.out.println(Arrays.toString(massive[i]));
        }
        System.out.println("Sorted :");

        for (int ii = 0; ii < massive.length; ii++) {
            for (int i = massive[ii].length - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (massive[ii][j] < massive[ii][j + 1]) {
                        int t = massive[ii][j];
                        massive[ii][j] = massive[ii][j + 1];
                        massive[ii][j + 1] = t;
                    }
                }
            }
            System.out.println(Arrays.toString(massive[ii]));
        }
    }
}

