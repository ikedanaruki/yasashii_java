class ABC {
  public int a;
  public int b;
  public int c;

  ABC(int x, int y, int z) {
    a = x;
    b = y;
    c = z;
  }
}

class Sample2701 {
  public static void main(String[] args) {
    ABC o1 = new ABC(10,20,30);
    ABC o2 = new ABC(50,60,70);
  }
}


