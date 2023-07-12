 interface Drawable{
     void draw();
 }
class Circle implements Drawable{
    @Override
    public void draw(){
        System.out.print("Drawing a Circle");
    }
}
class Rectangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();

        circle.draw();     // Output: Drawing a circle
        rectangle.draw();  // Output: Drawing a rectangle
    }
}