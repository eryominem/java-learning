package ru.nshi.learn.work6Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import ru.nshi.learn.Work6.Rectangle;

public class rectangleTest {
    @Test
    void rectangleTest() {
        double[] sides = {5, 2, 2, 5};
        Rectangle rt = new Rectangle(sides);
        rt.setColorHSB(112, 63, 24);
        double rectangleArea = rt.getArea();
        System.out.println(rt.information());
        assertEquals(10, rectangleArea);
    }

    @Test
    void rectangleTestExpectedException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            double[] sides_1 = {13, 10, 14, 10};
            Rectangle rt = new Rectangle(sides_1);
        });

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            double[] sides_2 = {4, 4, 3, 3};
            Rectangle rt = new Rectangle(sides_2);
            rt.setColorHSB(666, 15, -2);
        });
    }
}
