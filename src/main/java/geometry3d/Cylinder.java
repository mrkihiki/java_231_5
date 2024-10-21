package geometry3d;

import exceptions.VariablesLesThanZero;
import exceptions.VariablesNotSet;
import geometry2d.Figure;

public class Cylinder {
    private Figure figure;
    private float h;
    public Cylinder(float h, Figure figure) {
        this.h=h;
        this.figure =figure;
        if(this.h<0){
            throw new VariablesLesThanZero("h",this.h);
        } else if (this.h==0) {
            throw new VariablesNotSet("h");
        }
        if(this.figure ==null){
            throw new VariablesNotSet("Figure");
        }
    }
    public void setH(float h){
        this.h=h;
    }
    public void setFigure(Figure figure){
        this.figure=figure;
    }
    public double volume() {
        if(this.h<0){
            throw new VariablesLesThanZero("h",this.h);
        } else if (this.h==0) {
            throw new VariablesNotSet("h");
        }
        if(this.figure ==null){
            throw new VariablesNotSet("Figure");
        }
        return h* figure.area();
    }
}
