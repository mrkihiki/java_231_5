package geometry2d;

import exceptions.ExceptionsLesThanZero;

public class Circle implements Figure {
    private float radius;
    //public Circle(){this.radius=0;};
    public Circle(float radius) throws ExceptionsLesThanZero {
        this.radius = radius;
        if(this.radius<=0){
            throw new ExceptionsLesThanZero("Variables must be greater than zero");
        }
    }
    public void setRadius(float radius){
        this.radius=radius;
    }
    public float area(){
        return (float) (radius*radius*Math.PI);
    }

    public float perimeter() {
        return (float) (2*radius*Math.PI);
    }
    public String toString(){
        return "radius = "+radius+"; area = "+area()+";perimeter = "+perimeter()+";";
    }
}
