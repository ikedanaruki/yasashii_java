class X {
  int x;
  
  X(int a) {
    x = a;
  }
}

class Y extends X {
  int y;
  
  Y(int a, int b) {
    super(a);
    y = b;
  }
}

class Z extends Y {
  int z;

  Z(int a, int b, int c) {
    super(a,b);
    z = c;
  }
}

class Sample3202 {
  public static void main(String[] args) {
    Z o = new Z(1,2,3);
    System.out.println("x = " + o.x);
    System.out.println("y = " + o.y);
    System.out.println("z = " + o.z);
  }
}


