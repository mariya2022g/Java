package ru.academits.java;

public class Average {

    public static void main(String[] args) {

        int i = 3;
        int b = 17;

        double average = getAverage(i, b);
        System.out.println("Среднее арифметическое чисел = " + average);

        double evenAverage = getEvenAverage(i, b);
        System.out.println("Среднее арифметическое четных чисел = " + evenAverage);
    }

    public static double getAverage(int a, int b) {
        int sum = 0;
        int i = a;
        while (i <= b) {
            sum = sum + i;
            ++i;
        }
        return (double) sum / (b - a + 1);
    }

    public static double getEvenAverage(int a, int b) {
        int sum = 0;
        int i = a;
        while (i <= b) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
            ++i;
        }
        return (double) sum / (b - a + 1);
    }
}
