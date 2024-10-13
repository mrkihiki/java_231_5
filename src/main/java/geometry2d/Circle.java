package geometry2d;

import exceptions.ExceptionsLesThanZero;
import exceptions.VariablesNotSet;

public class Circle implements Figure {
    private float radius;
    public Circle(float radius){
        this.radius = radius;
        if(this.radius<0){
            throw new ExceptionsLesThanZero("radius",this.radius);
        }
    }
    public void setRadius(float radius){
        this.radius=radius;
    }
    public float area()  {
        if(this.radius<0){
            throw new ExceptionsLesThanZero("radius",this.radius);
        }
        if(this.radius==0){
            throw new VariablesNotSet("radius");
        }
        return (float) (radius*radius*Math.PI);
    }

    public float perimeter() {
        if(this.radius<0){
            throw new ExceptionsLesThanZero("radius",this.radius);
        }
        if(this.radius==0){
            throw new VariablesNotSet("radius");
        }
        return (float) (2*radius*Math.PI);
    }
    public String toString(){
            return "radius = "+radius+"; area = "+area()+";perimeter = "+perimeter()+";";
    }
}
