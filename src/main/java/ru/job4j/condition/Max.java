package ru.job4j.condition;

public class Max {

    public int maxNumber(int a, int b) {
         return  a > b ? a : b;
    }

    public int maxNumber(int a, int b, int c) {
        return maxNumber(maxNumber(a, b), c);
    }

    public int maxNumber(int a, int b, int c, int d) {
        return maxNumber(maxNumber(a, b, c), d);
    }
}
