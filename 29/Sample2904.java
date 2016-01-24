class X {
  static final int MAX = 100;
  final static int MIN = -100;
  final int DEFAULT = 10;
}

class Sample2904 {
  public static void main(String[] args) {
    System.out.println("value = " + X.MAX);
    System.out.println("value = " + X.MIN);
    X o = new X();
    System.out.println("value = " + o.DEFAULT);
  }
}
