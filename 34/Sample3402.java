abstract class Shape {
  double a;
  double b;

  Shape(double x, double y) {
    a = x;
    b = y;
  }

  abstract double getArea(); 
  void print() {}
}

class Triangle extends Shape {

  Triangle(double x, double y) {
    super(x,y);
  }

  double getArea() {
    return (a * b / 2);
  }
}

class Rectangle extends Shape {

  Rectangle(double x, double y) {
    super(x,y);
  }

  double getArea() {
    return (a * b);
  }
}

class Sample3402 {
  public static void main(String[] args) {
    Shape o2 = new Triangle(10.0,10.0);
    Shape o3 = new Rectangle(10.0,10.0);
    System.out.println("o2の面積" + o2.getArea());
    System.out.println("o3の面積" + o3.getArea());
  }
}

