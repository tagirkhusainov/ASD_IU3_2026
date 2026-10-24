/*
 * Задача 37. Разворот массива.
 * Вход: массив из n целых чисел.
 * Выход: массив, записанный в обратном порядке.
 */

package ru.bmstu.lab01.task_37;

import java.util.Scanner;

/** Решение задачи 37. */
public class Task37 {

    /**
     * Считывает массив, разворачивает его и выводит результат.
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
        reverse(numbers);
        for (int index = 0; index < numbers.length; index++) {
            if (index > 0) {
                System.out.print(" ");
            }
            System.out.print(numbers[index]);
        }
        System.out.println();
    }

    /**
     * Разворачивает массив на месте.
     *
     * @param numbers массив целых чисел
     */
    public static void reverse(int[] numbers) {
        for (int index = 0; index < numbers.length / 2; index++) {
            int oppositeIndex = numbers.length - 1 - index;
            int temporary = numbers[index];
            numbers[index] = numbers[oppositeIndex];
            numbers[oppositeIndex] = temporary;
        }
    }
}
