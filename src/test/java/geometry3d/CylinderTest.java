package geometry3d;

import geometry2d.Circle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {

    @Test
    void volume() {
        Circle a = new Circle(2.8209479177388f);
        Cylinder b = new Cylinder(4,a);
        assertEquals(100,b.volume());
    }
}