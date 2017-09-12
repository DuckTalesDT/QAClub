package HomeWork;

import java.util.Arrays;

/*
 В массиве хранятся 7 явно заданных текстовых строк.
 Создать программу, которая отсортирует и выведет на
 экран строки в алфавитном порядке
 */
public class LessonSecondTaskFourth {
    public static void main(String[] args) {
        sortTextMassive();
    }
    static void sortTextMassive() {
        String[] massive = {"Andrey", "Lena", "Denis", "Vadim", "Sasha", "Dima", "Artem"};

        Arrays.sort(massive);

        for(int i = 0; i < massive.length; i++){
            System.out.println(massive[i]);
        }
    }
}
