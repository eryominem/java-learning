package ru.nshi.learn.work4Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;
import ru.nshi.learn.work4.Task5;

import static org.junit.jupiter.api.Assertions.*;
//work 4, task5 test
public class Task5Test {
    Task5 task5;

    @BeforeEach
    void setUp(){task5 = new Task5();}

    @Test
    void testIsCorrectUniqueSymbols(){
        String str = "214912402402042010";
        String strUnique = task5.uniqueSymbols(str);
        String actual = "21490";
        assertEquals(strUnique, actual);
    }

    @ParameterizedTest
    @CsvSource({"Hello wworlld!!, Helo wrd!", "abcdabcd1337, abcd137"})
    void test2IsCorrectUniqueSymbols(String str, String expectedStr){
        String resultStr = task5.uniqueSymbols(str);
        assertEquals(resultStr, expectedStr);
    }
}
