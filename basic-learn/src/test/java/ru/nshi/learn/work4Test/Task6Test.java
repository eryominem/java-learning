package ru.nshi.learn.work4Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.nshi.learn.work4.Task6;

import static org.junit.jupiter.api.Assertions.*;
//work 4, task6 test
public class Task6Test {
    Task6 task6;

    @BeforeEach
    void setUp(){task6 = new Task6();}

    @Test
    void testMaxUniqueSymbols(){
        String[] strings = {"Hello", "world", "!!!"};
        String resultStr = task6.maxUniqueSymbolsInString(strings);
        String expectedStr = "world";
        assertEquals(resultStr, expectedStr);
    }
}
