class Size {
  private double value;

  protected void setValue(double v) {
    value = v;
  }

  protected double getValue() {
    return value;
  }
}

class Round extends Size {
  public Round(double d) {
    setValue(d);
  }

  public double getArea() {
    double d = getValue() * getValue() * 3.141592;
    return d;
  }
}

class Training31 {
  public static void main(String[] args) {
    Round o1 = new Round(125.3);
    Round o2 = new Round(251.4);
    System.out.println("半径" + o1.getValue()
		       + "の円の面積 = " + o1.getArea());
    System.out.println("半径" + o2.getValue()
		       + "の円の面積 = " + o2.getArea());
  }
}
 

