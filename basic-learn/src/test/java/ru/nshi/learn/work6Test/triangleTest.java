package ru.nshi.learn.work6Test;
import ru.nshi.learn.Work6.Triangle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class triangleTest {
    @Test
    void triangleTest(){
        double[] sides = {7,7,8};
        Triangle triangle = new Triangle(sides);
        assertEquals(22.978250586152114, triangle.getArea());
        System.out.print(triangle.information());
    }

    @Test
    void triangleExceptionTest(){
        double[] sides1 = {3, 3, 100};
        assertThrows(IllegalArgumentException.class, () -> {
            Triangle triangle = new Triangle(sides1);
        });
        double[] sides2 = {-7, -7, 8};
        assertThrows(IllegalArgumentException.class, () -> {
            Triangle triangle = new Triangle(sides2);
        });
    }

}
