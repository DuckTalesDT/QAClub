package HomeWork;

import java.util.Scanner;

/*
 Для введенного пользователем с клавиатуры натурального числа посчитайте
 сумму всех его цифр (заранее не известно сколько цифр будет в числе)
 */
public class LessonSecondTaskFirst {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter some number: ");
        int input = in.nextInt();

        int sum = 0;
        int i;
        int j = 1;
        for (i = input; (i / j) > 0; j = j * 10) {
            sum = sum + (i / j % 10);
        }
        System.out.println("Summa your number = " + sum);
    }
}
