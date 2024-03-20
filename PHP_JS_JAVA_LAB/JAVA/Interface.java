
import java.util.Scanner;

interface Volume {
  double pi = 3.14159;

  void readData();

  void dispVolume();
}

class Sphere implements Volume {
  double r, v;

  public void readData() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the radius of the sphere: ");
    r = sc.nextDouble();
  }

  
  public void dispVolume() {
    v = (4.0 / 3.0) * pi * r * r * r;
    System.out.println("Volume of Sphere: " + v);
  }
}

class Cylinder implements Volume {
  double r, h, v;

  public void readData() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the radius of the cylinder: ");
    r = sc.nextDouble();
    System.out.println("Enter the height of the cylinder: ");
    h = sc.nextDouble();
  }

  public void dispVolume() {
    v = pi * r * r * h;
    System.out.println("Volume of Cylinder: " + v);
  }
}

public class Interface {
  public static void main(String[] args) {
    Volume s = new Sphere();
    Volume c = new Cylinder();

    s.readData();
    s.dispVolume();

    c.readData();
    c.dispVolume();
  }
}