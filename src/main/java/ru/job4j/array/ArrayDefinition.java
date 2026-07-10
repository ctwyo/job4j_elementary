package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        String[] names = new String[4];
        names[0] = "Alex";
        names[1] = "Maria";
        names[2] = "Nick";
        names[3] = "Pavel";

        for (String name : names) {
            System.out.println(name);
        }
    }
}
