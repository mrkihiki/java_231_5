package geometry2d;

import exceptions.VariablesLesThanZeroException;
import exceptions.VariablesNotSetException;

import java.io.IOException;
import java.util.logging.*;

public class Rectangle implements Figure {
    private float width;
    private float height;
    private float answer;
    private static final Logger LOGGER = Logger.getLogger(Rectangle.class.getName());
    Handler fileHandler;
    {
        try {
            fileHandler = new FileHandler("figures.log");
            fileHandler.setFormatter(new XMLFormatter());
            LOGGER.addHandler(fileHandler);
            LOGGER.setUseParentHandlers(false);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    //public Rectangle(){};
    public Rectangle(int width, int height) {
        if(width<0 && height<0){
            LOGGER.log(Level.INFO,"Variables(width = {0}; height = {1}) must be greater than zero", new Object[]{this.width,this.height});
            throw new VariablesLesThanZeroException("width","height",this.width,this.height);
        }else if(width<0){
            LOGGER.log(Level.INFO,"Variables(width = {0}) must be greater than zero",this.width);
            throw new VariablesLesThanZeroException("width",this.width);
        }else if(height<0){
            LOGGER.log(Level.INFO,"Variables(height = {0}) must be greater than zero",this.height);
            throw new VariablesLesThanZeroException("height",this.height);
        }
        this.width=width;
        this.height=height;
    }
    public void setWidth(float width){
        if(width<0){
            LOGGER.log(Level.INFO,"Variables(width = {0}) must be greater than zero",this.width);
            throw new VariablesLesThanZeroException("width",this.width);
        }
        if(width==0){
            LOGGER.log(Level.INFO,"Variables(width = {0}) not set or equals 0",this.width);
            throw new VariablesNotSetException("width,height");
        }
        this.width= width;
    }
    public void setHeight(float height){
        if(height<0){
            LOGGER.log(Level.INFO,"Variables(height = {0}) must be greater than zero",this.height);
            throw new VariablesLesThanZeroException("height",this.height);
        }
        if(height==0){
            LOGGER.log(Level.INFO,"Variables(height = {0}) not set or equals 0",this.height);
            throw new VariablesNotSetException("width,height");
        }
        this.height= height;
    }
    public float area() {
        LOGGER.log(Level.INFO,"Start area()");
        answer=width * height;
        LOGGER.log(Level.INFO,"End");
        return answer;
    }
    public float perimeter() {
        LOGGER.log(Level.INFO,"Start perimeter()");
        answer=(width + height)*2;
        LOGGER.log(Level.INFO,"End");
        return answer;
    }
    public String toString(){
        return "width = "+width+";height = "+height+"; area = "+area()+";perimeter = "+perimeter()+";";
    }
}
