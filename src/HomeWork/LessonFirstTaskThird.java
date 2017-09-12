package HomeWork;

/**
 В три перемнные a, b и c записаны три вещественных числа.
 Создать программу которая будет находить и выводить на экран
 вещественные корни квадратного уравнения ax2+bx+c=0, либо
 сообщать, что корней нет
 */
public class LessonFirstTaskThird {
    public static void main(String[] args) {
        int a = 5;
        int b = 15;
        int c = 7;

        double d = b * b - 4 * a * c;
        if (d < 0)
            System.out.println("There is not discriminant");
        else {
            double x1 = (b * (-1) + Math.sqrt(d)) / (2 * a);
            double x2 = (b * (-1) - Math.sqrt(d)) / (2 * a);
            System.out.println("Discriminant with plus = " + x1);
            System.out.println("Discriminant with minus = " + x2);
        }
    }
}
