class Sample2601 { 
  void printValue(int i) {
    System.out.println("i = " + i);
  }

  void printValue(double d) {
    System.out.println("d = " + d);
  }

  void printValue(int i,double d) {
    System.out.println("i = " + i);
    System.out.println("d = " + d);
  }

  public static void main(String[] args) {
    Sample2601 o = new Sample2601();
    o.printValue(100);
    o.printValue(0.25);
    o.printValue(100,0.25);
  }
}

