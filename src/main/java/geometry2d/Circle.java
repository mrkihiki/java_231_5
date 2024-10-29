package geometry2d;

import exceptions.VariablesLesThanZeroException;
import exceptions.VariablesNotSetException;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.*;

public class Circle implements Figure {
    private float radius;
    private float answer;
    private static final Logger LOGGER = Logger.getLogger(Circle.class.getName());
    Handler fileHandler;
    {
        try {
            fileHandler = new FileHandler("figures.log");
            fileHandler.setFormatter(new XMLFormatter());
            LOGGER.addHandler(fileHandler);
            System.out.println(Arrays.toString(LOGGER.getHandlers()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    //public Circle(){};
    public Circle(float radius){
        if(this.radius<0){
            LOGGER.log(Level.SEVERE,"Variables(h = {0}) must be greater than zero",this.radius);
            throw new VariablesLesThanZeroException("radius",this.radius);
        }
        this.radius = radius;
    }
    public void setRadius(float radius){
        if(radius<0){
            LOGGER.log(Level.SEVERE,"Variables(h = {0}) must be greater than zero",this.radius);
            throw new VariablesLesThanZeroException("radius",this.radius);
        }
        if(radius==0){
            LOGGER.log(Level.FINEST, "Variables(h) not set or equals 0",this.radius);
            throw new VariablesNotSetException("radius");
        }
        this.radius=radius;
    }
    public float area()  {
        LOGGER.log(Level.SEVERE,"Start area()");
        this.answer= (float) (radius*radius*Math.PI);
        LOGGER.log(Level.SEVERE,"End");
        return answer;
    }

    public float perimeter() {
        LOGGER.log(Level.SEVERE,"Start perimeter()");
        this.answer= (float) (2*radius*Math.PI);
        LOGGER.log(Level.SEVERE,"End");
        return answer;
    }
    public String toString(){
            return "radius = "+radius+"; area = "+area()+";perimeter = "+perimeter()+";";
    }
}
