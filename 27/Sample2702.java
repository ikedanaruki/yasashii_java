class ABC {
  public static int count; 
  public int a;
  public int b;
  public int c;

  ABC(int x, int y, int z) {
    a = x;
    b = y;
    c = z;
    count++;
  }
}

class Sample2702 {
  public static void main(String[] args) {
    System.out.println("count = " + ABC.count);
    ABC o1 = new ABC(10,20,30);
    System.out.println("count = " + o1.count);
    ABC o2 = new ABC(50,60,70);
    System.out.println("count = " + ABC.count);
    System.out.println("a = " + o1.a);
    System.out.println("a = " + o2.a);
  }
}

