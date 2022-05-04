package ru.nshi.learn.work1Test;
//work 1, task1 test
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;
import ru.nshi.learn.work1.task1;

import static org.junit.jupiter.api.Assertions.*;

public class Task1Test {
    task1 task;

    @BeforeEach
    void setUp() {
        task = new task1();
    }

    @Test
    void testIsLucky(){
        boolean actual = task.lucky(123321);
        assertTrue(actual);
    }

    @Test
    void testIsNotLucky(){
        boolean actual = task.lucky(123124);
        assertFalse(actual);
    }

    @ParameterizedTest
    @ValueSource(ints = {666666, 101002, 163163})
    void testIsLuckyParameterized(int number){
        boolean actual = task.lucky(number);
        assertTrue(actual);
    }

    @ParameterizedTest
    @ValueSource(ints = {626666, 101032, 163063})
    void testIsNotLuckyParameterized(int number){
        boolean actual = task.lucky(number);
        assertFalse(actual);
    }
}
