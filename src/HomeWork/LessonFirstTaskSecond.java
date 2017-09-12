package HomeWork;

/*
 Создать программу, выводящую на экран ближайшее к 10 из двух чисел,
 записанных в переменные m и n.
 */
public class LessonFirstTaskSecond {
    public static void main(String[] args) {
        int number = 10;
        int m = 0;
        int n = 19;

        int i = 0;
        if (number > m)
            i = number - m;
        else
            i = m - number;

        int j = 0;
        if (number > n)
            j = number - n;
        else
            j = n - number;

        if (i > j)
            System.out.println("Our number is n");
        else
            System.out.println("Our number is m");
    }
}
