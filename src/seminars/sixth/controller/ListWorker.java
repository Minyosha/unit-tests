package seminars.sixth.controller;

import java.util.ArrayList;
import java.util.List;

public class ListWorker {
    public static List<Integer> generateList(Integer i) {
        List<Integer> list = new ArrayList<>();
        for (int j = 0; j < i; j++) {
            list.add((int) Math.round(Math.random() * 100));
        }
        return list;
    }

    public static double calculateAverage(List<Integer> list) {
        double sum = 0;
        double average = 0;
        for (int i : list) {
            sum += i;
        }
        average = sum / (double) list.size();
        return average;

    }

}
