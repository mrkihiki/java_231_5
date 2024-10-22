package geometry2d;

import exceptions.VariablesLesThanZero;
import exceptions.VariablesNotSet;
import geometry3d.Cylinder;

import java.io.IOException;
import java.util.logging.*;

public class Circle implements Figure {
    private float radius;
    private static final Logger LOGGER = Logger.getLogger(Circle.class.getName());
    Handler fileHandler;
    {
        try {
            fileHandler = new FileHandler("figures.log");
            fileHandler.setFormatter(new XMLFormatter());
            LOGGER.addHandler(fileHandler);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public Circle(){};
    public Circle(float radius){
        this.radius = radius;
        if(this.radius<0){
            LOGGER.log(Level.SEVERE,"Variables(h = {0}) must be greater than zero",this.radius);
            throw new VariablesLesThanZero("radius",this.radius);
        }
    }
    public void setRadius(float radius){
        this.radius=radius;
    }
    public float area()  {
        LOGGER.log(Level.SEVERE,"Start area()");
        if(this.radius<0){
            LOGGER.log(Level.SEVERE,"Variables(h = {0}) must be greater than zero",this.radius);
            throw new VariablesLesThanZero("radius",this.radius);
        }
        if(this.radius==0){
            LOGGER.log(Level.FINEST, "Variables(h) not set or equals 0",this.radius);
            throw new VariablesNotSet("radius");
        }
        LOGGER.log(Level.SEVERE,"End");
        return (float) (radius*radius*Math.PI);
    }

    public float perimeter() {
        LOGGER.log(Level.SEVERE,"Start perimeter()");
        if(this.radius<0){
            LOGGER.log(Level.SEVERE,"Variables(h = {0}) must be greater than zero",this.radius);
            throw new VariablesLesThanZero("radius",this.radius);
        }
        if(this.radius==0){
            LOGGER.log(Level.FINEST, "Variables(h) not set or equals 0",this.radius);
            throw new VariablesNotSet("radius");
        }
        LOGGER.log(Level.SEVERE,"End");
        return (float) (2*radius*Math.PI);
    }
    public String toString(){
            return "radius = "+radius+"; area = "+area()+";perimeter = "+perimeter()+";";
    }
}
