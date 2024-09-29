package com.cg.basicprograms;

public class AbstractionExample {
	public static void main(String args[])
    {
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);

        circle.displayInfo();
        rectangle.displayInfo();
    }
}
abstract class Shape {

 

    public abstract double  calculateArea();

    public  void displayInfo() {
        System.out.println("Area: " +calculateArea());
    }
}

 

class Circle extends Shape{
     private double radius;

 

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

 

    @Override
    public double calculateArea() {
        // TODO Auto-generated method stub
          return Math.PI * radius * radius;

    }

}
class Rectangle extends Shape{
     private double length;
     private double breadth;

    public Rectangle(double length, double breadth) {
        super();
        this.length = length;
        this.breadth = breadth;
    }

 

    @Override
    public double calculateArea() {
        // TODO Auto-generated method stub
        return length*breadth;
    }
}


