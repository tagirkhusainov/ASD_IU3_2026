package ru.bmstu.lab01.task_37;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Task37Test {

    @Test
    void shouldReverseArrayWithEvenLength() {
        int[] numbers = {1, 2, 3, 4};
        Task37.reverse(numbers);
        assertArrayEquals(new int[]{4, 3, 2, 1}, numbers);
    }

    @Test
    void shouldReverseArrayWithOddLength() {
        int[] numbers = {5, -2, 0};
        Task37.reverse(numbers);
        assertArrayEquals(new int[]{0, -2, 5}, numbers);
    }

    @Test
    void shouldKeepEqualNumbers() {
        int[] numbers = {7, 7, 7};
        Task37.reverse(numbers);
        assertArrayEquals(new int[]{7, 7, 7}, numbers);
    }
}
