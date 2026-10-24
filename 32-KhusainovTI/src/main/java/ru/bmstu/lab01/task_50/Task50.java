/*
 * Задача 50. Сумма столбцов матрицы.
 * Вход: матрица n x m из целых чисел.
 * Выход: массив сумм столбцов матрицы.
 */

package ru.bmstu.lab01.task_50;

import java.util.Scanner;

/** Решение задачи 50. */
public class Task50 {

    /**
     * Считывает матрицу и выводит суммы её столбцов.
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
        long[] result = calculateColumnSums(matrix);
        for (int index = 0; index < result.length; index++) {
            if (index > 0) {
                System.out.print(" ");
            }
            System.out.print(result[index]);
        }
        System.out.println();
    }

    /**
     * Вычисляет сумму элементов в каждом столбце матрицы.
     *
     * @param matrix матрица целых чисел
     * @return массив сумм столбцов
     */
    public static long[] calculateColumnSums(int[][] matrix) {
        int numberOfColumns = matrix[0].length;
        long[] result = new long[numberOfColumns];
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < numberOfColumns; column++) {
                result[column] = result[column] + matrix[row][column];
            }
        }
        return result;
    }
}
