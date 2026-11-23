
package it.giovanni.javacore;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class PalindromeCheckerTest {

    @Test
    void shouldRecognizeSimplePalindromes() {
        assertEquals(true, PalindromeChecker.palindromeChecker("anna"));
        assertEquals(true, PalindromeChecker.palindromeChecker("radar"));
        assertEquals(true, PalindromeChecker.palindromeChecker("level"));
    }

    @Test
    void shouldRecognizeNonPalindromes() {
        assertEquals(false, PalindromeChecker.palindromeChecker("hello"));
        assertEquals(false, PalindromeChecker.palindromeChecker("java"));
        assertEquals(false, PalindromeChecker.palindromeChecker("world"));
    }

    @Test
    void shouldIgnoreUppercaseAndLowercaseDifferences() {
        assertEquals(true, PalindromeChecker.palindromeChecker("Anna"));
        assertEquals(true, PalindromeChecker.palindromeChecker("RaDaR"));
        assertEquals(false, PalindromeChecker.palindromeChecker("Java"));
    }

    @Test
    void shouldRecognizeSingleCharacterWords() {
        assertEquals(true, PalindromeChecker.palindromeChecker("a"));
        assertEquals(true, PalindromeChecker.palindromeChecker("Z"));
    }

    @Test
    void shouldRecognizeEvenAndOddLengthPalindromes() {
        assertEquals(true, PalindromeChecker.palindromeChecker("abba"));
        assertEquals(true, PalindromeChecker.palindromeChecker("racecar"));
    }

    @Test
    void shouldThrowExceptionForNullInput() {
        assertThrows(
                IllegalArgumentException.class,
                () -> PalindromeChecker.palindromeChecker(null)
        );
    }

    @Test
    void shouldThrowExceptionForEmptyInput() {
        assertThrows(
                IllegalArgumentException.class,
                () -> PalindromeChecker.palindromeChecker("")
        );
    }

    @Test
    void shouldThrowExceptionForBlankInput() {
        assertThrows(
                IllegalArgumentException.class,
                () -> PalindromeChecker.palindromeChecker("   ")
        );
    }

    @Test
    void shouldConsiderSpacesAsCharacters() {
        assertEquals(false, PalindromeChecker.palindromeChecker("anna "));
        assertEquals(false, PalindromeChecker.palindromeChecker("a man"));
    }

    @Test
    void shouldConsiderPunctuationAsCharacters() {
        assertEquals(false, PalindromeChecker.palindromeChecker("anna!"));
        assertEquals(false, PalindromeChecker.palindromeChecker("a,b,c"));
    }
}
