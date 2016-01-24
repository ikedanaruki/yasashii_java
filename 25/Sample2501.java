class X {
  int x = 1000;
  public X() {
    System.out.println("コンストラクタが呼び出されました");
    //x = i;
  }
}

class Sample2501 {
  public static void main(String args[]) {
    X o = new X();
    System.out.println("x = " + o.x);
  }
}
