public class Value {

  private int count = 0;

  public synchronized void add() {
    int a = count;
    a++;
    for(int i = 0; i < 1000; i++) {
      for(int j = 0; j < 1000; j++) {
      }
    }
    count = a;
    System.out.println("value = " + count);
  }
}
