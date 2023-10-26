package seminars.sixth.view;

import java.util.List;

public class DisplayMethods {
    public static void printList(List<Integer> list) {
        System.out.println("Сгенерирован список чисел: ");
        for (Integer i : list) {
            System.out.print(i);
            if (list.indexOf(i) < list.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void compareAverages (double firstAverage, double secondAverage) {
        if (firstAverage == secondAverage) {
            System.out.println("Средние значения равны");
        } else if (firstAverage > secondAverage) {
            System.out.println("Первый список имеет большее среднее значение");
        } else if (firstAverage < secondAverage) {
            System.out.println("Второй список имеет большее среднее значение");
        }
    }
}
