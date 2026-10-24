package ru.bmstu.lab01.task_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task6Test {

    @Test
    void shouldCountNumbersAboveAverage() {
        int[] numbers = {1, 2, 3, 6};
        int actualCount = Task6.countNumbersAboveAverage(numbers);
        assertEquals(1, actualCount);
    }

    @Test
    void shouldReturnZeroWhenNumbersEqualAverage() {
        int[] numbers = {5, 5, 5};
        int actualCount = Task6.countNumbersAboveAverage(numbers);
        assertEquals(0, actualCount);
    }

    @Test
    void shouldWorkWithNegativeNumbers() {
        int[] numbers = {-6, -2, -1, -3};
        int actualCount = Task6.countNumbersAboveAverage(numbers);
        assertEquals(2, actualCount);
    }
}
