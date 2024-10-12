package geometry3d;

import geometry2d.Figure;

public class Cylinder {
    Figure A;
    double h;
    public Cylinder(double h, Figure A){
        this.h=h;
        this.A=A;
    }
    public double volume(){
        return h*A.area();
    }
}
