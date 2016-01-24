class X {
  public static int x;

  public static void printValue() {
    System.out.println("value :" + x);
  }

  public static void printValue(int i) {
    System.out.println("value :" + i);
  }
}

class Sample2802 {
  public static void main(String[] args) {
    X.x = 123;
    X.printValue();
    X.printValue(1000);
    X o = new X();
    o.printValue(200);
  }
}


