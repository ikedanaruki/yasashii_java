class X {
  int x;
  int y = x;
  public X() {
    System.out.println("コンストラクタが呼び出されました");
  }
}

class Sample2502 {
  public static void main(String args[]) {
    X o = new X();
    System.out.println("x = " + o.x);
  }
}
