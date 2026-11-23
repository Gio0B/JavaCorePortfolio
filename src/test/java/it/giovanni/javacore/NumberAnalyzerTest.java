
package it.giovanni.javacore;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class NumberAnalyzerTest {

    // Tests for isEven()

    @Test
    void shouldReturnTrueForEvenNumbers() {
        assertEquals(true, NumberAnalyzer.isEven(2));
        assertEquals(true, NumberAnalyzer.isEven(0));
        assertEquals(true, NumberAnalyzer.isEven(-4));
        assertEquals(true, NumberAnalyzer.isEven(Integer.MIN_VALUE));
    }

    @Test
    void shouldReturnFalseForOddNumbers() {
        assertEquals(false, NumberAnalyzer.isEven(3));
        assertEquals(false, NumberAnalyzer.isEven(-5));
        assertEquals(false, NumberAnalyzer.isEven(Integer.MAX_VALUE));
    }

    // Tests for sumDigits()

    @Test
    void shouldReturnZeroWhenSummingDigitsOfZero() {
        assertEquals(0, NumberAnalyzer.sumDigits(0));
    }

    @Test
    void shouldReturnCorrectSumForPositiveNumbers() {
        assertEquals(3, NumberAnalyzer.sumDigits(12));
        assertEquals(12, NumberAnalyzer.sumDigits(345));
        assertEquals(10, NumberAnalyzer.sumDigits(1234));
    }

    @Test
    void shouldReturnPositiveSumForNegativeNumbers() {
        assertEquals(6, NumberAnalyzer.sumDigits(-123));
        assertEquals(22, NumberAnalyzer.sumDigits(-4567));
    }

    @Test
    void shouldHandleIntegerLimitsWhenSummingDigits() {
        assertEquals(47, NumberAnalyzer.sumDigits(Integer.MIN_VALUE));
        assertEquals(46, NumberAnalyzer.sumDigits(Integer.MAX_VALUE));
    }

    // Tests for countDigits()

    @Test
    void shouldReturnOneWhenCountingDigitsOfZero() {
        assertEquals(1, NumberAnalyzer.countDigits(0));
    }

    @Test
    void shouldCountDigitsOfPositiveNumbers() {
        assertEquals(1, NumberAnalyzer.countDigits(7));
        assertEquals(2, NumberAnalyzer.countDigits(14));
        assertEquals(4, NumberAnalyzer.countDigits(9860));
    }

    @Test
    void shouldCountDigitsOfNegativeNumbers() {
        assertEquals(3, NumberAnalyzer.countDigits(-123));
        assertEquals(4, NumberAnalyzer.countDigits(-4567));
    }

    @Test
    void shouldHandleIntegerLimitsWhenCountingDigits() {
        assertEquals(10, NumberAnalyzer.countDigits(Integer.MIN_VALUE));
        assertEquals(10, NumberAnalyzer.countDigits(Integer.MAX_VALUE));
    }
}
