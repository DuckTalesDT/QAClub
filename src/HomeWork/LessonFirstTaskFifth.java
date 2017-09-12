package HomeWork;

/**
 В городе N проезд в трамвае осуществляется по бумажным отрывным билетам.
 Каждую неделю трамвайное депо заказывает в местной типографии рулон билетов
 с номерами от 000001 до 999999. «Счастливым» считается билетик у которого
 сумма первых трёх цифр номера равна сумме последних трёх цифр, как, например,
 в билетах с номерами 003102 или 567576. Трамвайное депо решило подарить сувенир
 обладателю каждого счастливого билета и теперь раздумывает, как много сувениров
 потребуется. С помощью программы подсчитайте сколько счастливых билетов в одном рулоне?
 */
public class LessonFirstTaskFifth {
    public static void main(String[] args) {
        Tickets win = new Tickets();
        win.WinTicket();
    }

}
class Tickets{
    static void WinTicket() {
        int sum = 0;
        String[] massive = new String[999999];
        String s;
        for (int i = 0; i < massive.length; i++) {
            s = "00000" + Integer.toString(i + 1);
            massive[i] = s.substring(s.length() - 6);
        }

        for (int i = 0; i < massive.length; i++) {
            int b1 = Integer.parseInt(massive[i]) / 1000 % 10;
            int b2 = Integer.parseInt(massive[i]) / 10000 % 10;
            int b3 = Integer.parseInt(massive[i]) / 100000 % 10;
            int c1 = Integer.parseInt(massive[i]) / 1 % 10;
            int c2 = Integer.parseInt(massive[i]) / 10 % 10;
            int c3 = Integer.parseInt(massive[i]) / 100 % 10;

            if ((b1 + b2 + b3) == (c1 + c2 + c3))
                sum = sum + 1;
        }
        System.out.println(sum);
    }
}
