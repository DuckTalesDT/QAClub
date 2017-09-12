package HomeWork;

import java.util.Scanner;

/*
Создайте программу, вычисляющую факториал числа n,
которое пользователь введет с клавиатуры
*/

public class LessonFirstTaskFirst {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter some number: ");
        int input = in.nextInt();

        int f = 1;
        for (int i = 1; i <= input; i++){
            f = f * i;
        }
        System.out.println("Factorial your number = " + f);
    }
}



