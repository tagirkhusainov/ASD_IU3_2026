/*
 * Задача 10. Поиск элемента с условием.
 * Вход: массив из n целых чисел и число k.
 * Выход: индекс последнего элемента, кратного k, или -1.
 */

package ru.bmstu.lab01.task_10;

import java.util.Scanner;

/** Решение задачи 10. */
public class Task10 {

    /**
     * Считывает массив и число, затем выводит нужный индекс.
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
        int divisor = input.nextInt();
        System.out.println(findLastDivisibleIndex(numbers, divisor));
    }

    /**
     * Находит индекс последнего элемента, кратного заданному числу.
     *
     * @param numbers массив целых чисел
     * @param divisor число, на которое проверяется делимость
     * @return индекс последнего подходящего элемента или -1
     */
    public static int findLastDivisibleIndex(int[] numbers, int divisor) {
        for (int index = numbers.length - 1; index >= 0; index--) {
            if (numbers[index] % divisor == 0) {
                return index;
            }
        }
        return -1;
    }
}
