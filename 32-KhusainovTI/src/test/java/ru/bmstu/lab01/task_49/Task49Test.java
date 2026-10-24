package ru.bmstu.lab01.task_49;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Task49Test {

    @Test
    void shouldCalculateRowSums() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        long[] actualResult = Task49.calculateRowSums(matrix);
        assertArrayEquals(new long[]{6, 15}, actualResult);
    }

    @Test
    void shouldWorkWithNegativeNumbers() {
        int[][] matrix = {{-1, 2}, {-3, -4}};
        long[] actualResult = Task49.calculateRowSums(matrix);
        assertArrayEquals(new long[]{1, -7}, actualResult);
    }

    @Test
    void shouldWorkWithZeroRow() {
        int[][] matrix = {{0, 0}, {3, 4}};
        long[] actualResult = Task49.calculateRowSums(matrix);
        assertArrayEquals(new long[]{0, 7}, actualResult);
    }
}
