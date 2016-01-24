class Sample1803 {
  public static void main(String[] args) {
    int i = 300;
    int j = 200;

    if(i > 100 && j > 100)
      System.out.println("iもjも100より大きいぞ！");
    if(i > 100 || j > 100)
      System.out.println("iかjの最低ひとつは100より大きいぞ！");
    if(i > 100 ^ j > 100)
      System.out.println("iかjのどちらかひとつが100より大きいぞ！");
    if(!(i < 100))
      System.out.println("iは「100より大きくない」の反対だぞ！");
  }
}