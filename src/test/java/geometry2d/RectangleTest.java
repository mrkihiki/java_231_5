package geometry2d;

import exceptions.VariablesLesThanZero;
import exceptions.VariablesNotSet;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void area() {
        Rectangle a = new Rectangle(5,4);
        assertEquals(20,a.area());
        a.setWidth(-5);
        assertThrows(VariablesLesThanZero.class,a::area);
        Circle b= new Circle();
        assertThrows(VariablesNotSet.class, b::area);
    }

    @Test
    void perimeter() {
        Rectangle a = new Rectangle(5,4);
        assertEquals(18,a.perimeter());
        a.setHeight(-5);
        assertThrows(VariablesLesThanZero.class,a::perimeter);
        Circle b= new Circle();
        assertThrows(VariablesNotSet.class, b::perimeter);
    }
}