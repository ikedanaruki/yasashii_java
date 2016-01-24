class X {
  static int i = 100;
  int j = 200;

  void printValue() {
    System.out.println("i = " + i);
    System.out.println("j = " + j);
    int i = 123;
    int j = 456;
    System.out.println("i = " + i);
    System.out.println("j = " + j);
  }
}

class Sample2903 {
  public static void main(String[] args) {
    X o = new X();
    o.printValue();
  }
}
