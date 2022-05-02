package ru.nshi.learn.work3Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;
import ru.nshi.learn.work3.Task1;

import static org.junit.jupiter.api.Assertions.*;
//work 3, task1 test
public class Task1Test {
    Task1 task1;

    @BeforeEach
    void setUp(){task1 = new Task1();}

    @ParameterizedTest
    @CsvSource({"0, 13", "1, 5"})
    void testIsCorrectSumRow(int row_number, int sum){
        int[][] array = {{5, 8}, {1,4}};
        int[] sumRow = task1.sumLinesArray(array);
        int actual = sumRow[row_number];
        assertTrue(actual == sum);
    }
}
