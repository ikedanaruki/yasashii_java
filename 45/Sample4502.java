public class Sample4502 {
  public static void main(String[] args) {
    Value v = new Value();
    PrintNumber o1 = new PrintNumber(v);
    o1.start();
    PrintNumber o2 = new PrintNumber(v);
    o2.start();
  }
}







