class Sample2302 {
  public static void main(String[] arg) {
    int a[] = {20,100,-40,500,70};
    int b[] = a;
    a[0] = 50;
    for(int i = 0; i < b.length; i++) {
      System.out.println("添字は" + i + ":"
          + "値は" + b[i]);
    }
  }
}
