package com.cg.collectopic;




class NegativeValueException extends Exception {
    public NegativeValueException(String message) {
        super(message);
    }
}

class Shape {
    public double area;

    public Shape() {
        this.area = 0.0;
    }

    public Shape(double area) {
        this.area = area;
    }
}

class Rectangle extends Shape {
    public Rectangle(double length, double width) throws NegativeValueException {
        if (length < 0 || width < 0) {
            throw new NegativeValueException("Length and width must be greater than zero.");
        }
        this.area = length * width;
    }
}

class Circle extends Shape {
    public Circle(double radius) throws NegativeValueException {
        if (radius < 0) {
            throw new NegativeValueException("Radius must be greater than zero.");
        }
        this.area = Math.PI * Math.pow(radius, 2);
    }
}

class Triangle extends Shape {
    public Triangle(double base, double height) throws NegativeValueException {
        if (base < 0 || height < 0) {
            throw new NegativeValueException("Base and height must be greater than zero.");
        }
        this.area = 0.5 * base * height;
    }
}

public class AreaCalculator {
    public static void main(String[] args) {
        try {
            Rectangle rectangle = new Rectangle(4.0, -5.0);
            System.out.println("Area of Rectangle: " + rectangle.area);

            Circle circle = new Circle(3.0);
            System.out.println("Area of Circle: " + circle.area);

            Triangle triangle = new Triangle(6.0, 7.0);
            System.out.println("Area of Triangle: " + triangle.area);
        } catch (NegativeValueException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
