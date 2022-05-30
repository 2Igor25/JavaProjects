package ru.edu;

import java.util.Comparator;

public class CustomDigitComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1==null||o2==null) {
            throw new IllegalArgumentException("Input error");
        }

        if (((o1 % 2 == 0) && (o2 % 2 == 0)) || ((o1 % 2 != 0) && (o2 % 2 != 0))) {
            return 0;
        } else if ((o1 % 2 == 0) && (o2 % 2 != 0)) {
            return -1;
        } else {
            return 1;
        }
    }
}
