package ru.nshi.learn.work3Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;
import ru.nshi.learn.work3.Task2;

import static org.junit.jupiter.api.Assertions.*;
//work 3, task2 test
public class Task2Test {
    Task2 task2;

    @BeforeEach
    void setUp(){task2 = new Task2();}

    @ParameterizedTest
    @CsvSource({"0, 6", "1, 12"})
    void testIsCorrectSumColumns(int columns_number, int sum){
        int[][] array = {{5, 8}, {1,4}};
        int[] sumColumns = task2.sumColumnsArray(array);
        int actual = sumColumns[columns_number];
        assertTrue(actual == sum);
    }
}
