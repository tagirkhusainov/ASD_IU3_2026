/*
 * Задача 6. Элементы больше среднего.
 * Вход: массив из n целых чисел.
 * Выход: количество элементов, строго больших среднего арифметического.
 */

package ru.bmstu.lab01.task_6;

import java.util.Scanner;

/** Решение задачи 6. */
public class Task6 {

    /**
     * Считывает массив и выводит количество элементов больше среднего.
     *
     * @param args аргументы командной строки не используются
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfElements = input.nextInt();
        int[] numbers = new int[numberOfElements];
        for (int index = 0; index < numberOfElements; index++) {
            numbers[index] = input.nextInt();
        }
        System.out.println(countNumbersAboveAverage(numbers));
    }

    /**
     * Считает количество элементов, которые больше среднего значения.
     *
     * @param numbers массив целых чисел
     * @return количество элементов больше среднего
     */
    public static int countNumbersAboveAverage(int[] numbers) {
        long sum = 0;
        for (int index = 0; index < numbers.length; index++) {
            sum = sum + numbers[index];
        }
        long average = sum / numbers.length;
        int count = 0;
        for (int index = 0; index < numbers.length; index++) {
            if (numbers[index] > average) {
                count++;
            }
        }
        return count;
    }
}
