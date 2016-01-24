public class PrintNumber extends Thread {
  private Value obj;

  public PrintNumber(Value o) {
    obj = o;
  }

  public void run() {
    for(int i = 0; i < 50; i++) {
      synchronized(obj) {
	obj.add();
      }
    }
  }
}
