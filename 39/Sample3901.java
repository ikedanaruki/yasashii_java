class Sample3901 {
  public static void m() throws ArrayIndexOutOfBoundsException {
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


