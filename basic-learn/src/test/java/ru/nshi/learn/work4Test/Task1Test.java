package ru.nshi.learn.work4Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;
import ru.nshi.learn.work4.Task1;

import static org.junit.jupiter.api.Assertions.*;
//work 4, task1 test
public class Task1Test {
    Task1 task1;

    @BeforeEach
    void setUp(){task1 = new Task1();}

    @ParameterizedTest
    @CsvSource({"0,M", "1,Ma", "2,Max", "3,Maxi","4,Maxim"})
    void testIsCorrectStings(int index, String actual){
        String[] resultes = task1.stringArray("Maxim");
        assertEquals(actual, resultes[index]);
    }
}
