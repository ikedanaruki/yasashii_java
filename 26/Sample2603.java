class AB {
  private int a;
  private int b;
  
  AB() {
    a = 0;
    b = 0;
  }

  AB(int i, int j) {
    a = i;
    b = j;
  }
  
  void printValue() {
    System.out.println("a = " + a);
    System.out.println("b = " + b);
  }
}

class Sample2604 { 
  public static void main(String[] args) {
    AB o1 = new AB();
    AB o2 = new AB(100,200);
    o1.printValue();
    o2.printValue();
  }
}

