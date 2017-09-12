package HomeWork;

import java.util.Arrays;
import java.util.Random;

/*
Создать метод, который будет выводить указанный массив на экран в строку.
С помощью созданного метода заполнить 5 массивов из 10 элементов каждый случайными числами
и вывести на экран, каждый на отдельной строке
 */
public class LessonSecondTaskSecond {
    public static void main(String[] args) {
        randomMassive();
    }

        static void randomMassive() {

            Random randomGenerator = new Random();

            int[] newSeries1 = new int[10];
            int[] newSeries2 = new int[10];
            int[] newSeries3 = new int[10];
            int[] newSeries4 = new int[10];
            int[] newSeries5 = new int[10];
            String s1 = "";
            String s2 = "";
            String s3 = "";
            String s4 = "";
            String s5 = "";

            for (int i = 0; i < 10; i++){
                newSeries1[i] = randomGenerator.nextInt(100);
                newSeries2[i] = randomGenerator.nextInt(100);
                newSeries3[i] = randomGenerator.nextInt(100);
                newSeries4[i] = randomGenerator.nextInt(100);
                newSeries5[i] = randomGenerator.nextInt(100);
            }

            for (int i = 0; i < 10; i++){
                s1 = s1 + newSeries1[i] + " ";
                s2 = s2 + newSeries2[i] + " ";
                s3 = s3 + newSeries3[i] + " ";
                s4 = s4 + newSeries4[i] + " ";
                s5 = s5 + newSeries5[i] + " ";
            }

            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s3);
            System.out.println(s4);
            System.out.println(s5);
        }

}
