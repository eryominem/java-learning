package ru.nshi.learn.work1Test;
//work 1, task3 test
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;
import ru.nshi.learn.work1.Task3;

import static org.junit.jupiter.api.Assertions.*;

public class Task3Test {
    Task3 task3;

    @BeforeEach
    void setUp() {task3 = new Task3();}

    @ParameterizedTest
    @ValueSource(ints = {17, 13, 3})
    void testIsSimple(int number){
        boolean actual = task3.simpleNumber(number);
        assertTrue(actual);
    }

    @ParameterizedTest
    @ValueSource(ints = {6, 14, 28})
    void testIsNotSimple(int number){
        boolean actual = task3.simpleNumber(number);
        assertFalse(actual);
    }
}
