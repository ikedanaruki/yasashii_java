class Sample2602 { 
  void printValue(int i) {
    System.out.println("i = " + i);
  }

  int printValue(int i) {
    System.out.println("i = " + i);
    return i;
  }

  public static void main(String[] args) {
    Sample2602 o = new Sample2602();
    o.printValue(100);
    int a = o.printValue(200);
  }
}

