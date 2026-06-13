/* Abstract class: Shape with abstract method double calculateArea().
Subclasses:
Rectangle with fields length and width
Circle with field radius
Triangle with fields base and height
Override calculateArea() in each to return area.
Create an array of Shape references and compute total area.
File: ShapeAreaCalculator.java. */

abstract class Shape{
    public void calculateArea(){
    }
}

class Rectangle extends Shape{
    public double length;
    public double width;

    public Rectangle(double l, double w){
        this.length = l;
        this.width = w;
    }

    @Override
    public void calculateArea(){
        System.out.println("Area of Rectangle: " + (length * width));
    }
}

class Circle extends Shape{
    public double radius;
    final double PI = 3.14;

    public Circle(double r){
        this.radius = r;
    }

    @Override
    public void calculateArea(){
        System.out.println("Area of Circle: " + (PI * (radius * radius) ));
    }
}

class Triangle extends Shape{
    public double base;
    public double height;

    public Triangle(double b, double h){
        this.base = b;
        this.height = h;
    }

    @Override
    public void calculateArea(){
        System.out.println("Area of Triangle: " + (0.5 * (base * height) ));
    }
}

public class ShapeAreaCalculator {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];

        shape[0] = new Rectangle(200, 300);
        shape[1] = new Circle(50);
        shape[2] = new Triangle(5, 10);

        for(int i = 0; i < shape.length; i++){
            shape[i].calculateArea();
        }
    }
}
