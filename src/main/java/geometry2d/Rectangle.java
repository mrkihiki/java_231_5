package geometry2d;

import exceptions.ExceptionsLesThanZero;
import exceptions.VariablesNotSet;

public class Rectangle implements Figure {
    private float width;
    private float height;

    public Rectangle(int width, int height) {
        this.width=width;
        this.height=height;
        if(this.width<0 && this.height<0){
            throw new ExceptionsLesThanZero("width","height",this.width,this.height);
        }else if(this.width<0){
            throw new ExceptionsLesThanZero("width",this.width);
        }else if(this.height<0){
            throw new ExceptionsLesThanZero("height",this.height);
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
            throw new ExceptionsLesThanZero("width","height",this.width,this.height);
        }else if(this.width<0){
            throw new ExceptionsLesThanZero("width",this.width);
        }else if(this.height<0){
            throw new ExceptionsLesThanZero("height",this.height);
        }
        if(this.width==0 && this.height==0){
            throw new VariablesNotSet("width,height");
        }else if(this.width==0){
            throw new VariablesNotSet("width,height");
        }else if(this.height==0){
            throw new VariablesNotSet("width,height");
        }
        return width * height;
    }
    public float perimeter() {
        if(this.width<0 && this.height<0){
            throw new ExceptionsLesThanZero("width","height",this.width,this.height);
        }else if(this.width<0){
            throw new ExceptionsLesThanZero("width",this.width);
        }else if(this.height<0){
            throw new ExceptionsLesThanZero("height",this.height);
        }
        if(this.width==0 && this.height==0){
            throw new VariablesNotSet("width,height");
        }else if(this.width==0){
            throw new VariablesNotSet("width,height");
        }else if(this.height==0){
            throw new VariablesNotSet("width,height");
        }
        return (width + height)*2;
    }
    public String toString(){
        return "width = "+width+";height = "+height+"; area = "+area()+";perimeter = "+perimeter()+";";
    }
}
