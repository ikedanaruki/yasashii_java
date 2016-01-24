class X {
  int x;
  
  X() {
    x = 100;
  }
}

class Y extends X {
  int y;
  
  Y() {
    y = 200;
  }
}

class Z extends Y {
  int z;

  Z() {
    z = 300;
  }
}

class Sample3201 {
  public static void main(String[] args) {
    Z o = new Z();
    System.out.println("x = " + o.x);
    System.out.println("y = " + o.y);
    System.out.println("z = " + o.z);
  }
}

