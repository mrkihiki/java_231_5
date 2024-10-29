package geometry3d;

import geometry2d.Circle;
import exceptions.VariablesLesThanZeroException;
import exceptions.VariablesNotSetException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {

    @Test
    void volume() {
        Circle a = new Circle(2.8209479177388f);
        Cylinder b = new Cylinder(4,a);
        assertEquals(100,b.volume());
        Cylinder z = new Cylinder(4,a);
        assertThrows(VariablesNotSetException.class, ()->{
            Cylinder q= new Cylinder(4, null);
        });
        assertThrows(VariablesLesThanZeroException.class,()->{z.setH(-5);});
    }
}