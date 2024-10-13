package geometry2d;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void area() {
        Rectangle a = new Rectangle(5,4);
        assertEquals(20,a.area());
    }

    @Test
    void perimeter() {
        Rectangle a = new Rectangle(5,4);
        assertEquals(18,a.perimeter());
    }
}