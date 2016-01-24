class ABC {
  private int a;
  private int b;
  private int c;

  void printField() {
    System.out.println("a = " + a);
    System.out.println("b = " + b);
    System.out.println("c = " + c);
  }

  void setValue(int x,int y,int z) {
    a = x;
    b = y;
    c = z;
  }
  int getTotal() {
    return (a+b+c);
  }
}

class Sample2401 {
  public static void main(String[] args) {
    ABC o = new ABC();
    o.setValue(10,20,30);
    o.printField();
    int total = o.getTotal();
    System.out.println("total = " + total);
  }
}
