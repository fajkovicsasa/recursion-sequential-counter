package com.kayak.sequential_counter.counter;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CounterTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeAll
    public void init() {
        System.setOut(new PrintStream(outContent));
    }

    @BeforeEach
    public void clear() throws IOException {
        outContent.reset();
    }

    @Test
    public void shouldCountUp_1() {
        Counter.countUp(0, 1);

        List<String> outputNumbers = Arrays.asList(new String(outContent.toByteArray()).split("\r\n"));

        assertEquals(2, outputNumbers.size());
        assertEquals("0", outputNumbers.get(0));
        assertEquals("1", outputNumbers.get(1));
    }

    @Test
    public void shouldCountUp_2() {
        Counter.countUp(1, 10);

        List<String> outputNumbers = Arrays.asList(new String(outContent.toByteArray()).split("\r\n"));

        assertEquals(10, outputNumbers.size());
        assertEquals("1", outputNumbers.get(0));
        assertEquals("2", outputNumbers.get(1));
        assertEquals("3", outputNumbers.get(2));
        assertEquals("4", outputNumbers.get(3));
        assertEquals("5", outputNumbers.get(4));
        assertEquals("6", outputNumbers.get(5));
        assertEquals("7", outputNumbers.get(6));
        assertEquals("8", outputNumbers.get(7));
        assertEquals("9", outputNumbers.get(8));
    }

    @Test
    public void shouldCountUpAndDown_1() {
        Counter.countUpAndDown(0, 1);

        List<String> outputNumbers = Arrays.asList(new String(outContent.toByteArray()).split("\r\n"));

        assertEquals(3, outputNumbers.size());
        assertEquals("0", outputNumbers.get(0));
        assertEquals("1", outputNumbers.get(1));
        assertEquals("0", outputNumbers.get(2));
    }

    @Test
    public void shouldCountUpAndDown_2() {
        Counter.countUpAndDown(0, 5);

        List<String> outputNumbers = Arrays.asList(new String(outContent.toByteArray()).split("\r\n"));

        assertEquals(11, outputNumbers.size());
        assertEquals("0", outputNumbers.get(0));
        assertEquals("1", outputNumbers.get(1));
        assertEquals("2", outputNumbers.get(2));
        assertEquals("3", outputNumbers.get(3));
        assertEquals("4", outputNumbers.get(4));
        assertEquals("5", outputNumbers.get(5));
        assertEquals("4", outputNumbers.get(6));
        assertEquals("3", outputNumbers.get(7));
        assertEquals("2", outputNumbers.get(8));
        assertEquals("1", outputNumbers.get(9));
        assertEquals("0", outputNumbers.get(10));
    }
}
