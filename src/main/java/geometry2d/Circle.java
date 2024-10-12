package geometry2d;

public class Circle implements Figure {
    private float radius;
    public Circle(){
        this.radius=0;
    };
    public Circle(float radius) {
        this.radius = radius;
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
