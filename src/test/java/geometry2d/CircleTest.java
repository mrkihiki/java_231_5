package geometry2d;

import org.junit.jupiter.api.Test;
import exceptions.VariablesLesThanZero;
import exceptions.VariablesNotSet;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CircleTest {

    @Test
    void area() {
        Circle a= new Circle(5);
        assertEquals(78.5398178100586,a.area());
        a.setRadius(-5);
        assertThrows(VariablesLesThanZero.class,a::area);
        Circle b= new Circle();
        assertThrows(VariablesNotSet.class, b::area);
    }

    @Test
    void perimeter() {
        Circle a = new Circle(5);
        assertEquals(31.415925979614258, a.perimeter());
        a.setRadius(-5);
        assertThrows(VariablesLesThanZero.class,a::perimeter);
        Circle b= new Circle();
        assertThrows(VariablesNotSet.class, b::perimeter);
    }
}