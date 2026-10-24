/*
 * Задача 49. Сумма строк матрицы.
 * Вход: матрица n x m из целых чисел.
 * Выход: массив сумм строк матрицы.
 */

package ru.bmstu.lab01.task_49;

import java.util.Scanner;

/** Решение задачи 49. */
public class Task49 {

    /**
     * Считывает матрицу и выводит суммы её строк.
     *
     * @param args аргументы командной строки не используются
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfRows = input.nextInt();
        int numberOfColumns = input.nextInt();
        int[][] matrix = new int[numberOfRows][numberOfColumns];
        for (int row = 0; row < numberOfRows; row++) {
            for (int column = 0; column < numberOfColumns; column++) {
                matrix[row][column] = input.nextInt();
            }
        }
        long[] result = calculateRowSums(matrix);
        for (int index = 0; index < result.length; index++) {
            if (index > 0) {
                System.out.print(" ");
            }
            System.out.print(result[index]);
        }
        System.out.println();
    }

    /**
     * Вычисляет сумму элементов в каждой строке матрицы.
     *
     * @param matrix матрица целых чисел
     * @return массив сумм строк
     */
    public static long[] calculateRowSums(int[][] matrix) {
        long[] result = new long[matrix.length];
        for (int row = 0; row < matrix.length; row++) {
            long sum = 0;
            for (int column = 0; column < matrix[row].length; column++) {
                sum = sum + matrix[row][column];
            }
            result[row] = sum;
        }
        return result;
    }
}
