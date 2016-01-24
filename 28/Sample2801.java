class X {
  private static x;

  public static void printValue() {
    System.out.println("value :" + x);
  }
  public static void printValue(int i) {
    System.out.println("value :" + i);
  }
}

class Sample2801 {
  public static void main(String[] args) {
    ABC o1 = new ABC(10,20,30);
    o1.printValue();
  }
}


