

import java.util.Scanner;

abstract class Shape {
  abstract void area();
}

class TwoDim extends Shape {
  void area() {
  }
}

class ThreeDim extends Shape {
  void area() {
  }
}

class Square extends TwoDim {
  double s;

  Square(double s) {
    this.s = s;
  }

  void area() {
    System.out.println("Area of Square: " + s * s);
  }
}

class Triangle extends TwoDim {
  double b, h;

  Triangle(double b, double h) {
    this.b = b;
    this.h = h;
  }

  void area() {
    System.out.println("Area of Triangle: " + 0.5 * b * h);
  }
}

class Sphere extends ThreeDim {
  double r;

  Sphere(double r) {
    this.r = r;
  }

  void area() {
    System.out.println("Surface Area of Sphere: " + 4 * Math.PI * r * r);
  }
}

class Cube extends ThreeDim {
  double s;

  Cube(double s) {
    this.s = s;
  }

  void area() {
    System.out.println("Surface Area of Cube: " + 6 * s * s);
  }
}

public class Abstract {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the side length of the square: ");
    double s1 = sc.nextDouble();
    Shape s = new Square(s1);
    s.area();
    System.out.print("Enter the base and height of the triangle: ");
    double b = sc.nextDouble();
    double h = sc.nextDouble();
    Shape t = new Triangle(b, h);
    t.area();
    System.out.print("Enter the radius of the sphere: ");
    double r = sc.nextDouble();
    Shape sp = new Sphere(r);
    sp.area();
    System.out.print("Enter the side length of the cube: ");
    double s2 = sc.nextDouble();
    Shape c = new Cube(s2);
    c.area();
    sc.close();
  }
}