package ru.nshi.learn.work4Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;
import ru.nshi.learn.work4.Task2;

import static org.junit.jupiter.api.Assertions.*;
//work 4, task2 test
public class Task2Test {
    Task2 task2;

    @BeforeEach
    void setUp(){task2 = new Task2();}

    @ParameterizedTest
    @CsvSource({"Hello World, HW", "gGWp, GW", "bvd123FAMQvt, FAMQ"})
    void testIsCorrectUpperCase(String str, String actual){
        String resultFunction = task2.stringOnlyUpperCase(str);
        assertEquals(resultFunction, actual);
    }

}
