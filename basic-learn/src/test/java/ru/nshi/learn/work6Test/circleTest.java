package ru.nshi.learn.work6Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;
import static org.junit.jupiter.api.Assertions.*;
import ru.nshi.learn.Work6.Circle;

public class circleTest {
    @Test
    void circleTest() {
        Circle cr = new Circle(10);
        double circleArea = cr.getArea();
        cr.setColorRGB(63, 163, 220);
        System.out.println(cr.information());
        assertEquals(314.1592653589793, circleArea);
    }

    @Test
    void circleTestExpectedException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Circle cr = new Circle(-10);
        });

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Circle cr = new Circle(5);
            cr.setColorHSB(-100, 300, 20);
        });
    }
}
