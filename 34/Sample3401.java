class Shape {
  double a;
  double b;

  Shape(double x, double y) {
    a = x;
    b = y;
  }

  double getArea() {
    return 0.0;
  }
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

class Sample3401 {
  public static void main(String[] args) {
    Shape o1 = new Shape(10.0,10.0);
    Shape o2 = new Triangle(10.0,10.0);
    Shape o3 = new Rectangle(10.0,10.0);
    System.out.println("o1の面積" + o1.getArea());
    System.out.println("o2の面積" + o2.getArea());
    System.out.println("o3の面積" + o3.getArea());
  }
}

