package ru.nshi.learn.work4Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;
import ru.nshi.learn.work4.Task4;

import static org.junit.jupiter.api.Assertions.*;
//work 4, task4 test
public class Task4Test {
    Task4 task4;

    @BeforeEach
    void setUp(){task4 = new Task4();}

    @Test
    void testSumDigitsInString(){
        String str = "win@228!.k1e3k3q7";
        int sumDigits = task4.sumNumbersInString(str);
        int expectedSum= 2+2+8+1+3+3+7;
        assertEquals(sumDigits, expectedSum);
    }

    @ParameterizedTest
    @CsvSource({"k1e2k3, 6", "He11o WoR1d, 3"})
    void test2SumDigitsInString(String str, int expectedSum){
        int sumDigits = task4.sumNumbersInString(str);
        assertEquals(sumDigits, expectedSum);
    }
}
