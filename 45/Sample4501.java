class PrintNumber extends Thread {
  public void run() {
    for(int i = 0; i < 5; i++) {
      System.out.println("value = " + i);
    }
  }
}

class Sample4501 {
  public static void main(String[] args) {
    PrintNumber o = new PrintNumber();
    o.start();
    try {	
      o.join();
    }
    catch(InterruptedException e) {
      System.out.println("例外が発生");
    }		
    for(int i = 0; i < 10; i++) {
      System.out.println("in main method value = " + i);
    }
  }
}
