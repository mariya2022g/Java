package ru.academits.java;

import java.util.Scanner;

public class Average {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число а: ");
        int i = scanner.nextInt();
        System.out.print("Введите число b: ");
        int b = scanner.nextInt();

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
        int k = 0;
        while (i <= b) {
            if (i % 2 == 0) {
                sum = sum + i;
                k++;
            }
            i++;
        }
        return (double) sum / k;
    }
}