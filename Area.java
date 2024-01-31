package interfaceproject;


interface Shape {
 double getArea();
}

class Rectangle implements Shape {
 private double length;
 private double width;

 // Constructor
 public Rectangle(double length, double width) {
     this.length = length;
     this.width = width;
 }

 @Override
 public double getArea() {
     return length * width;
 }
}

class Circle implements Shape {
 private double r;

 // Constructor
 public Circle(double r) {
     this.r = r;
 }

 @Override
 public double getArea() {
     return Math.PI * r * r;
 }
}

class Triangle implements Shape {
 private double base;
 private double height;

 public Triangle(double base, double height) {
     this.base = base;
     this.height = height;
 }

 @Override
 public double getArea() {
     return 0.5 * base * height;
 }
}

public class Area {
 public static void main(String[] args) {
     Rectangle rectangle = new Rectangle(2, 3);
     Circle circle = new Circle(5);
     Triangle triangle = new Triangle(4, 2);

     System.out.println("Area of a Rectangle is: " + rectangle.getArea());
     System.out.println("Area of a Circle is: " + circle.getArea());
     System.out.println("Area of a Triangle is: " + triangle.getArea());
 }
}


