package geometry2d;

import exceptions.VariablesLesThanZeroException;
import exceptions.VariablesNotSetException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void area() {
        Rectangle a = new Rectangle(5,4);
        assertEquals(20,a.area());
        assertThrows(VariablesLesThanZeroException.class,()->{a.setWidth(-5);});
        assertThrows(VariablesNotSetException.class, ()->{a.setWidth(0);});
    }

    @Test
    void perimeter() {
        Rectangle a = new Rectangle(5,4);
        assertEquals(18,a.perimeter());
        assertThrows(VariablesLesThanZeroException.class,()->{a.setWidth(-5);});
        assertThrows(VariablesNotSetException.class, ()->{a.setWidth(0);});
    }
}