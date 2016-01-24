class Value {
  private int count = 0;

  public synchronized void add() {
    int a = count;
    a++;
    for(int i = 0; i < 1000; i++) {
      for(int j = 0; j < 1000; j++) {
      }
    }
    count = a;
    System.out.println("value = " + count);
  }
}

class PrintNumber extends Thread {
  private Value obj;

  public PrintNumber(Value o) {
    obj = o;
  }

  public void run() {
    for(int i = 0; i < 50; i++) {
      obj.add();
    }
  }
}

class Sample4503 {
  public static void main(String[] args) {
    Value v = new Value();
    PrintNumber o1 = new PrintNumber(v);
    o1.start();
    PrintNumber o2 = new PrintNumber(v);
    o2.start();
  }
}







