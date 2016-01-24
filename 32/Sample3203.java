class X {
  int x;
  
  X() {
    System.out.println("X() 起動");
    x = 0;
  }

  X(int a) {
    System.out.println("X(int a) 起動");
    x = a;
  }
}

class Y extends X {
  int y;
  
  Y() {
    this(0);
    System.out.println("Y() 起動");
  }
  
  Y(int b) {
    System.out.println("Y(int b) 起動");
    y = b;
  }

  Y(int a, int b) {
    super(a);
    System.out.println("Y(int a, int b) 起動");
    y = b;
  }
}

class Sample3203 {
  public static void main(String[] args) {
    Y o1 = new Y(10,20);
    Y o2 = new Y(100);
    Y o3 = new Y();
  }
}


