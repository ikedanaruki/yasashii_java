class Point {
  protected double x;
  protected double y;

  public Point(double a, double b) {
    x = a;
    y = b;
  }
}

class Line {
  Point start;
  Point end;

  public Line(double x1, double y1, double x2, double y2) {
    start = new Point(x1,y1);
    end = new Point(x2,y2);
  }

  public void printPoints() {
    System.out.println("線分の座標は、" 
		       + "("+ start.x + "," + start.y +")"
		       + "-"
		       + "("+ end.x + "," + end.y +")"
		       +"です。");
  }
}

class Sample3302 {
  public static void main(String[] args) {
    Line o = new Line(100,200,300,400);
    o.printPoints();
  }
}


