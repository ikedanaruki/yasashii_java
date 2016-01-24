class X {
  private int x;

  void setValue(int i) {
    x = i;
  }

  int getValue() {
    return x;
  }
}
  
class Sample2901 {

  static void printValue(X obj) {
    System.out.println("value = " + obj.getValue());
  }

  public static void main(String[] args) {
    X o = new X();
    o.setValue(123);
    printValue(o);
  }
}
