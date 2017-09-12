package HomeWork;

import java.util.Arrays;

/**
 В enum хранится 7 явно заданных
 текстовых строк. Создать программу, которая
 отсортирует и выведет на экран строки в
 алфавитном порядке, используя коллекции.
 */
public class LessonThirdTaskFirst {
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
