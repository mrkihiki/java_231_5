package geometry3d;

import geometry2d.Circle;
import org.junit.jupiter.api.Test;
import exceptions.VariablesLesThanZero;
import exceptions.VariablesNotSet;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {

    @Test
    void volume() {
        Circle a = new Circle(2.8209479177388f);
        Cylinder b = new Cylinder(4,a);
        assertEquals(100,b.volume());
        a.setRadius(-5);
        Cylinder z = new Cylinder(4,a);
        assertThrows(VariablesLesThanZero.class,z::volume);
        assertThrows(VariablesNotSet.class, ()->{
            Cylinder q= new Cylinder(4, null);
        });
        a.setRadius(5);
        z.setFigure(a);
        z.setH(-5);
        assertThrows(VariablesLesThanZero.class,z::volume);
    }
}