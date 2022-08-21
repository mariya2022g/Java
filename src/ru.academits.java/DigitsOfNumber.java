package ru.academits.java;

import java.util.Scanner;

public class DigitsOfNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        System.out.println("Сумма цифр числа = " + getSumOfDigits(number));
        System.out.println("Сумма нечетных цифр числа = " + getSumOddDigits(number));
        System.out.println("Максимальная цифра = " + getMaxDigit(number));
    }

    private static int getSumOfDigits(int number) {
        number = Math.abs(number);
        int sum = 0;
        do {
            sum += number % 10;
            number /= 10;
        } while (number > 0);
        return sum;
    }

    private static int getSumOddDigits(int number) {
        number = Math.abs(number);
        int sum = 0;
        do {
            int digit = number % 10;
            if (digit % 2 != 0) {
                sum += digit;
            }
            number /= 10;
        } while (number > 0);
        return sum;
    }

    private static int getMaxDigit(int number) {
        number = Math.abs(number);
        int max = 0;
        do {
            if (number % 10 > max) {
                max = number % 10;
            }
            number /= 10;
        } while (number > 0);
        return max;
    }
}