package geometry2d;

import exceptions.ExceptionsLesThanZero;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void area() {
        try {
            Circle a= new Circle(5);
            assertEquals(78.5398178100586,a.area());
        } catch (ExceptionsLesThanZero e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void perimeter() {
        try {
            Circle a = new Circle(5);
            assertEquals(31.415925979614258,a.perimeter());
        } catch (ExceptionsLesThanZero e) {
            throw new RuntimeException(e);
        }
    }
}