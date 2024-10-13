package geometry2d;

import exceptions.ExceptionsLesThanZero;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void area() {
        try {
            Rectangle a = new Rectangle(5,4);
            assertEquals(20,a.area());
        } catch (ExceptionsLesThanZero e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void perimeter() {
        try {
            Rectangle a = new Rectangle(5,4);
            assertEquals(18,a.perimeter());
        } catch (ExceptionsLesThanZero e) {
            throw new RuntimeException(e);
        }
    }
}