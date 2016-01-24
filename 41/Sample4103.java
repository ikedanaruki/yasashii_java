class Sample4103 {
  public static void main(String args[]) {
    String s1 = "abcde";
    String s2 = "abcde";
    s1 = s1 + "f";
    s2 = s2 + "f";
    System.out.println("s1とs2を比較したら？");
    if(s1.equals(s2) == true) {
      System.out.println("同じ!");
    }
    else {
      System.out.println("同じではない！");
    }
  }
}
