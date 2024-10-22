package geometry2d;

import exceptions.VariablesLesThanZero;
import exceptions.VariablesNotSet;

import java.io.IOException;
import java.util.logging.*;

public class Rectangle implements Figure {
    private float width;
    private float height;
    private static final Logger LOGGER = Logger.getLogger(Rectangle.class.getName());
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
    public Rectangle(){};
    public Rectangle(int width, int height) {
        this.width=width;
        this.height=height;
        if(this.width<0 && this.height<0){
            LOGGER.log(Level.SEVERE,"Variables(width = {0}; height = {1}) must be greater than zero", new Object[]{this.width,this.height});
            throw new VariablesLesThanZero("width","height",this.width,this.height);
        }else if(this.width<0){
            throw new VariablesLesThanZero("width",this.width);
        }else if(this.height<0){
            throw new VariablesLesThanZero("height",this.height);
        }
    }
    public void setWidth(float width){
        this.width= width;
    }
    public void setHeight(float height){
        this.height= height;
    }
    public float area() {
        if(this.width<0 && this.height<0){
            LOGGER.log(Level.SEVERE,"Variables(width = {0}; height = {1}) must be greater than zero", new Object[]{this.width,this.height});
            throw new VariablesLesThanZero("width","height",this.width,this.height);
        }else if(this.width<0){
            LOGGER.log(Level.SEVERE,"Variables(width = {0}) must be greater than zero",this.width);
            throw new VariablesLesThanZero("width",this.width);
        }else if(this.height<0){
            LOGGER.log(Level.SEVERE,"Variables(height = {0}) must be greater than zero",this.height);
            throw new VariablesLesThanZero("height",this.height);
        }
        if(this.width==0 && this.height==0){
            LOGGER.log(Level.SEVERE,"Variables(width = {0}; height = {1}) not set or equals 0", new Object[]{this.width,this.height});
            throw new VariablesNotSet("width,height");
        }else if(this.width==0){
            LOGGER.log(Level.SEVERE,"Variables(width = {0}) not set or equals 0",this.width);
            throw new VariablesNotSet("width,height");
        }else if(this.height==0){
            LOGGER.log(Level.SEVERE,"Variables(height = {0}) not set or equals 0",this.height);
            throw new VariablesNotSet("width,height");
        }
        return width * height;
    }
    public float perimeter() {
        if(this.width<0 && this.height<0){
            LOGGER.log(Level.SEVERE,"Variables(width = {0}; height = {1}) must be greater than zero", new Object[]{this.width,this.height});
            throw new VariablesLesThanZero("width","height",this.width,this.height);
        }else if(this.width<0){
            LOGGER.log(Level.SEVERE,"Variables(width = {0}) must be greater than zero",this.width);
            throw new VariablesLesThanZero("width",this.width);
        }else if(this.height<0){
            LOGGER.log(Level.SEVERE,"Variables(height = {0}) must be greater than zero",this.height);
            throw new VariablesLesThanZero("height",this.height);
        }
        if(this.width==0 && this.height==0){
            LOGGER.log(Level.SEVERE,"Variables(width = {0}; height = {1}) not set or equals 0", new Object[]{this.width,this.height});
            throw new VariablesNotSet("width,height");
        }else if(this.width==0){
            LOGGER.log(Level.SEVERE,"Variables(width = {0}) not set or equals 0",this.width);
            throw new VariablesNotSet("width,height");
        }else if(this.height==0){
            LOGGER.log(Level.SEVERE,"Variables(height = {0}) not set or equals 0",this.height);
            throw new VariablesNotSet("width,height");
        }
        return (width + height)*2;
    }
    public String toString(){
        return "width = "+width+";height = "+height+"; area = "+area()+";perimeter = "+perimeter()+";";
    }
}
