package ru.nshi.learn.work4Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.nshi.learn.work4.Task3;

import static org.junit.jupiter.api.Assertions.*;
//work 4, task3 test
public class Task3Test {
    Task3 task3;

    @BeforeEach
    void setUp(){task3 = new Task3();}

    @Test
    void testArrayOfDigits(){
        String str = "win@228!.k1e3k3q7";
        int countDigitsInStr = task3.countNumbersInArray(str);
        char[] newStr = task3.numbersArray(str, countDigitsInStr);
        char[] actual = {'2', '2', '8', '1', '3', '3', '7'};
        assertArrayEquals(newStr, actual);
    }

}
