
package it.giovanni.javacore;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class ArrayAnalyzerTest {

    // FIND MAX TESTS

    @Test
    void shouldReturnTheMaxValueOfTheArray() {
        assertEquals(5, ArrayAnalyzer.findMax(new int[] {1, 2, 3, 4, 5}));
    }

    @Test
    void shouldReturnTheMaxValueOfNegativeNumbers() {
        assertEquals(-1, ArrayAnalyzer.findMax(new int[] {-5, -3, -1, -8}));
    }

    @Test
    void shouldReturnTheMaxValueWhenAllElementsAreEqual() {
        assertEquals(7, ArrayAnalyzer.findMax(new int[] {7, 7, 7, 7}));
    }

    @Test
    void shouldReturnTheMaxValueOfASingleElementArray() {
        assertEquals(10, ArrayAnalyzer.findMax(new int[] {10}));
    }

    // FIND MIN TESTS

    @Test
    void shouldReturnTheMinValueOfTheArray() {
        assertEquals(1, ArrayAnalyzer.findMin(new int[] {1, 2, 3, 4, 5}));
    }

    @Test
    void shouldReturnTheMinValueOfNegativeNumbers() {
        assertEquals(-8, ArrayAnalyzer.findMin(new int[] {-5, -3, -1, -8}));
    }

    @Test
    void shouldReturnTheMinValueWhenAllElementsAreEqual() {
        assertEquals(7, ArrayAnalyzer.findMin(new int[] {7, 7, 7, 7}));
    }

    @Test
    void shouldReturnTheMinValueOfASingleElementArray() {
        assertEquals(10, ArrayAnalyzer.findMin(new int[] {10}));
    }

    // CALCULATE AVERAGE TESTS

    @Test
    void shouldCalculateTheAverageOfTheArray() {
        assertEquals(3.0, ArrayAnalyzer.calculateAverage(new int[] {1, 2, 3, 4, 5}), 0.0001);
    }

    @Test
    void shouldCalculateTheAverageWithDecimalResult() {
        assertEquals(2.5, ArrayAnalyzer.calculateAverage(new int[] {1, 2, 3, 4}), 0.0001);
    }

    @Test
    void shouldCalculateTheAverageOfNegativeNumbers() {
        assertEquals(-3.0, ArrayAnalyzer.calculateAverage(new int[] {-1, -2, -3, -4, -5}), 0.0001);
    }

    @Test
    void shouldCalculateTheAverageOfASingleElementArray() {
        assertEquals(10.0, ArrayAnalyzer.calculateAverage(new int[] {10}), 0.0001);
    }

    // COUNT OCCURRENCES TESTS

    @Test
    void shouldCountTheOccurrencesOfATargetValue() {
        assertEquals(3, ArrayAnalyzer.countOccurrences(new int[] {1, 2, 2, 3, 2}, 2));
    }

    @Test
    void shouldReturnZeroWhenTargetIsNotPresent() {
        assertEquals(0, ArrayAnalyzer.countOccurrences(new int[] {1, 2, 3, 4, 5}, 10));
    }

    @Test
    void shouldCountAllOccurrencesWhenElementsAreEqual() {
        assertEquals(4, ArrayAnalyzer.countOccurrences(new int[] {5, 5, 5, 5}, 5));
    }

    @Test
    void shouldCountOccurrencesInASingleElementArray() {
        assertEquals(1, ArrayAnalyzer.countOccurrences(new int[] {5}, 5));
    }

    // INVALID INPUT TESTS

    @Test
    void shouldThrowExceptionWhenFindMaxReceivesNull() {
        assertThrows(IllegalArgumentException.class,
                () -> ArrayAnalyzer.findMax(null));
    }

    @Test
    void shouldThrowExceptionWhenFindMaxReceivesAnEmptyArray() {
        assertThrows(IllegalArgumentException.class,
                () -> ArrayAnalyzer.findMax(new int[] {}));
    }

    @Test
    void shouldThrowExceptionWhenFindMinReceivesNull() {
        assertThrows(IllegalArgumentException.class,
                () -> ArrayAnalyzer.findMin(null));
    }

    @Test
    void shouldThrowExceptionWhenFindMinReceivesAnEmptyArray() {
        assertThrows(IllegalArgumentException.class,
                () -> ArrayAnalyzer.findMin(new int[] {}));
    }

    @Test
    void shouldThrowExceptionWhenCalculateAverageReceivesNull() {
        assertThrows(IllegalArgumentException.class,
                () -> ArrayAnalyzer.calculateAverage(null));
    }

    @Test
    void shouldThrowExceptionWhenCalculateAverageReceivesAnEmptyArray() {
        assertThrows(IllegalArgumentException.class,
                () -> ArrayAnalyzer.calculateAverage(new int[] {}));
    }

    @Test
    void shouldThrowExceptionWhenCountOccurrencesReceivesNull() {
        assertThrows(IllegalArgumentException.class,
                () -> ArrayAnalyzer.countOccurrences(null, 5));
    }

    @Test
    void shouldThrowExceptionWhenCountOccurrencesReceivesAnEmptyArray() {
        assertThrows(IllegalArgumentException.class,
                () -> ArrayAnalyzer.countOccurrences(new int[] {}, 5));
    }
}
