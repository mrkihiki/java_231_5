package geometry2d;

import exceptions.VariablesLesThanZeroException;
import exceptions.VariablesNotSetException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void area() {
        Circle a= new Circle(5);
        assertEquals(78.5398178100586,a.area());
        assertThrows(VariablesLesThanZeroException.class,()->{a.setRadius(-5);});
        assertThrows(VariablesNotSetException.class, ()->{a.setRadius(0);});
    }

    @Test
    void perimeter() {
        Circle a = new Circle(5);
        assertEquals(31.415925979614258, a.perimeter());
        assertThrows(VariablesLesThanZeroException.class,()->{a.setRadius(-5);});
        assertThrows(VariablesNotSetException.class, ()->{a.setRadius(0);});
    }
}