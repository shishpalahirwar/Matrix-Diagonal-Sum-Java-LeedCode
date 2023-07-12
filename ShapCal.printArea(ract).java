abstract class Shape{
    public abstract double claculateArea();
}
class Ractangle extends Shape{
    private double length;
    private double width;
    public Ractangle(double length,double width){
        this.length=length;
        this.width=width;
    }
    public double claculateArea(){
        return length*width;
    }
}
class Circle extends Shape{
    private double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    public double claculateArea(){
        return Math.PI *radius*radius;
    }
}
class Triangle extends Shape{
    private double base;
    private double height;
    public Triangle(double base,double height){
        this.base=base;
        this.height=height;
    }
    public double claculateArea(){
        return 0.5*base*height;
    }
}
class ShapCal{
    public static void printArea(Shape s){
        double Area=s.claculateArea();
        System.out.print("Area: "+Area);
    }
}
public class Main{
    public static void main(String[] args){
        ShapCal sub=new ShapCal();
        Ractangle ract=new Ractangle(5,3);
        Circle cir=new Circle(4.5);
        Triangle trin=new Triangle(6,4);
        ShapCal.printArea(ract);
        ShapCal.printArea(cir);
        ShapCal.printArea(trin);
    }
}