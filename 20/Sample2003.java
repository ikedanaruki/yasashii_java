class Sample2003 {
  public static void main(String args[]) {
    int i = 0;
    System.out.println("まわりはじめます");
    while(i < 10) {
      System.out.println("変数iの値は" + i + "です");
      if(i == 5) continue;
      i++;
    }
    System.out.println("まわりおわりました");
  }
}
