package HomeWork;

import java.util.Arrays;
import java.util.Random;

/**
 Создать метод, который будет сортировать указанный массив
 по возрастанию любым известным вам способом
 */
public class LessonSecondTaskThird {
    public static void main(String[] args) {
        sortMassive1();
        sortMassive2();
    }

    static void sortMassive1() {
        int[] massive = {5, 3, 8, 4, 0, 9, 7};

        for (int i = massive.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (massive[j] > massive[j + 1]) {
                    int t = massive[j];
                    massive[j] = massive[j + 1];
                    massive[j + 1] = t;
                }
            }
        }
        System.out.println(Arrays.toString(massive));
    }

    static void sortMassive2() {
        int[] massive = {5, 3, 8, 4, 0, 9, 7};

        Arrays.sort(massive);
        System.out.println(Arrays.toString(massive));

    }
}
