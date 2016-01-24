interface Printable {
  int MAX_VALUE = 100;
  void print();
}

class X implements Printable {
  int x;
  public void print() {
    if(x < MAX_VALUE) {
      System.out.println("x = " + x);
    }
    else {
      System.out.println("too larage...");
    }
  }
}

class Sample3501 {
  public static void main(String[] args) {
    X o = new X();
    o.x = 105;
    o.print();
  }
}
