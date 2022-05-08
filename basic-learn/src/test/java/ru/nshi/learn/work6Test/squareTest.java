package ru.nshi.learn.work6Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import ru.nshi.learn.Work6.Square;

public class squareTest {
    @Test
    void squareTest(){
        double[] sides = {3, 3, 3, 3};
        Square sq = new Square(sides);
        sq.setColorRGB(112, 63, 24);
        assertEquals(9, sq.getArea());
        System.out.print(sq.information());
    }

    @Test
    void squareTest2() {
        double[] sides = {5, 5, 5, 5};
        Square sq = new Square(sides);
        sq.setColorRGB(228, 20, 114);
        double squareArea = sq.getArea();
        System.out.println(sq.information());
        assertEquals(25.0, squareArea);
    }
}
