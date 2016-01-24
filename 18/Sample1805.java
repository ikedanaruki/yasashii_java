class Sample1805 {
  public static void main(String[] args) {
    int i = 5;

    switch(i) {
      case 1:
        System.out.println("iの値は1だぞ！");
        break;
      case 2:
      case 3:
        System.out.println("iの値は2か3だぞ！");
        break;
      case 5:
        System.out.println("iの値は5だぞ！");
        break;
      default:
        System.out.println("iの値は1,2,3,5以外だぞ！");
        break;
    }
  }
}
