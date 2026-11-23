
package it.giovanni.javacore;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

    private final ByteArrayOutputStream outputStream =
            new ByteArrayOutputStream();

    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStream));
    }

    @AfterEach
    void tearDown() {
        System.setOut(originalOut);
    }

    private String getOutput() {
        return outputStream.toString()
                .replace("\r\n", "\n")
                .trim();
    }

    @Test
    void shouldPrintFizzForNumberDivisibleByThree() {
        FizzBuzz.fizzBuzz(3);
        assertEquals("1\n2\nFizz", getOutput());
    }

    @Test
    void shouldPrintBuzzForNumberDivisibleByFive() {
        FizzBuzz.fizzBuzz(5);
        assertEquals("1\n2\nFizz\n4\nBuzz", getOutput());
    }

    @Test
    void shouldPrintFizzBuzzForNumberDivisibleByThreeAndFive() {
        FizzBuzz.fizzBuzz(15);

        String expected = """
                1
                2
                Fizz
                4
                Buzz
                Fizz
                7
                8
                Fizz
                Buzz
                11
                Fizz
                13
                14
                FizzBuzz""";

        assertEquals(expected, getOutput());
    }

    @Test
    void shouldPrintNumberWhenNotDivisibleByThreeOrFive() {
        FizzBuzz.fizzBuzz(7);

        String expected = """
                1
                2
                Fizz
                4
                Buzz
                Fizz
                7""";

        assertEquals(expected, getOutput());
    }
}
