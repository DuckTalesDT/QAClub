package HomeWork;

import java.util.ArrayList;
import java.util.List;

/**
 Cоздать две произвольных коллекции со
 строковыми данными, сравнить содержимое,
 вывести количество одинаковых и отличающихся
 записей.
 */
public class LessonThirdTaskThird {
    public static void main(String[] args) {
        List<String> listStrings1 = new ArrayList<String>();
        listStrings1.add("First");
        listStrings1.add("Second");
        listStrings1.add("Third");
        listStrings1.add("Fourth");

        List<String> listStrings2 = new ArrayList<String>();
        listStrings2.add("Third");
        listStrings2.add("Fourth");
        listStrings2.add("Fifth");
        listStrings2.add("Sixth");

        int similar = 0;
        int notSimilar = 0;
        boolean fl_similar;

        for (String element1 : listStrings1) {
            fl_similar = false;
            for (String element2 : listStrings2) {
                if(element1.equals(element2)) {
                    similar++;
                    fl_similar = true;
                }
            }
             if (fl_similar == false)
                 notSimilar ++;
        }

        for (String element2 : listStrings2) {
            fl_similar = false;
            for (String element1 : listStrings1) {
                if(element1.equals(element2))
                    fl_similar = true;
            }
            if (fl_similar == false)
                notSimilar ++;
        }
        System.out.println("Similar is " + similar);
        System.out.println("Not similar is " + notSimilar);


    }
}
