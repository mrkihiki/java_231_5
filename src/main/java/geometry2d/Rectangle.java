package geometry2d;

public class Rectangle implements Figure {
    private float width;
    private float height;
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
