package ru.nshi.learn.work4Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;
import ru.nshi.learn.work4.Task7;

import static org.junit.jupiter.api.Assertions.*;
//work 4, task7 test
public class Task7Test {
    Task7 task7;

    @BeforeEach
    void setUp(){task7 = new Task7();}

    @ParameterizedTest
    @CsvSource({"Hello world !!!, world", "my name is Maximilian, Maximilian"})
    void testMaxUniqueSymbolsInString(String str, String expectedStr){
        String resultStr = task7.maxUniqueSymbolsTrim(str);
        assertEquals(resultStr, expectedStr);
    }

}
