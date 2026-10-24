package ru.bmstu.lab01.task_10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task10Test {

    @Test
    void shouldFindLastDivisibleIndex() {
        int[] numbers = {3, 7, 10, 14, 9};
        int actualIndex = Task10.findLastDivisibleIndex(numbers, 2);
        assertEquals(3, actualIndex);
    }

    @Test
    void shouldReturnMinusOneWhenNumberIsMissing() {
        int[] numbers = {1, 5, 7};
        int actualIndex = Task10.findLastDivisibleIndex(numbers, 2);
        assertEquals(-1, actualIndex);
    }

    @Test
    void shouldFindDivisibleNumberAtFirstIndex() {
        int[] numbers = {6, 5, 7};
        int actualIndex = Task10.findLastDivisibleIndex(numbers, 3);
        assertEquals(0, actualIndex);
    }
}
