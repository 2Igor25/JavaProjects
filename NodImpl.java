package ru.edu;

public class NodImpl implements Nod{

    @Override
    public int calculate(int first, int second) {
        while (second !=0) {
            int tmp = first%second;
            first = second;
            second = tmp;
        }
        return first;
    }
}
