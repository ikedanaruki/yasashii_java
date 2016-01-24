class Sample3801 {
  public static void m() {
    int[] i = new int[10];
    i[20] = 123;
  }

  public static void main(String[] args) {
    try {
      m();
    }
    catch(ArrayIndexOutOfBoundsException e) {
      System.out.println("配列の添字の指定で不手際がありますよ！");
    }
  }
}




