package geometry2d;

import exceptions.ExceptionsLesThanZero;

public class Rectangle implements Figure {
    private float width;
    private float height;

    public Rectangle(int width, int height) throws ExceptionsLesThanZero {
        this.width=width;
        this.height=height;
        if(this.width<=0 || this.height<=0){
            throw new ExceptionsLesThanZero("Variables must be greater than zero");
        }
    }
    public void setWidth(float width){
        this.width= width;
    }
    public void setHeight(float height){
        this.height= height;
    }
    public float area(){
        return width * height;
    }
    public float perimeter() {
        return (width + height)*2;
    }
    public String toString(){
        return "width = "+width+";height = "+height+"; area = "+area()+";perimeter = "+perimeter()+";";
    }
}
