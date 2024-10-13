package geometry3d;

import exceptions.ExceptionsLesThanZero;
import geometry2d.Figure;

public class Cylinder {
    Figure A;
    double h;
    public Cylinder(double h, Figure A) throws ExceptionsLesThanZero {
        this.h=h;
        this.A=A;
        if(this.h<=0 || this.A==null){
            throw new ExceptionsLesThanZero("Variables must be greater than zero");
        }
    }
    public double volume(){
        return h*A.area();
    }
}
