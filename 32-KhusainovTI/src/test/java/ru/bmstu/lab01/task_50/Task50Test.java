package ru.bmstu.lab01.task_50;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Task50Test {

    @Test
    void shouldCalculateColumnSums() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        long[] actualResult = Task50.calculateColumnSums(matrix);
        assertArrayEquals(new long[]{5, 7, 9}, actualResult);
    }

    @Test
    void shouldWorkWithNegativeNumbers() {
        int[][] matrix = {{-1, 2}, {-3, -4}};
        long[] actualResult = Task50.calculateColumnSums(matrix);
        assertArrayEquals(new long[]{-4, -2}, actualResult);
    }

    @Test
    void shouldWorkWithZeroColumn() {
        int[][] matrix = {{0, 3}, {0, 4}};
        long[] actualResult = Task50.calculateColumnSums(matrix);
        assertArrayEquals(new long[]{0, 7}, actualResult);
    }
}
