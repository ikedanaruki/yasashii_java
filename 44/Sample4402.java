class PrintNumber implements Runnable {
  public void run() {
    for(int i = 0; i < 1000; i++) {
      System.out.println("value = " + i);
    }
  }
}

class Sample4402 {
  public static void main(String[] args) {
    PrintNumber p = new PrintNumber();
    Thread o = new Thread(p);
    o.start();
    for(int i = 0; i < 20; i++) {
      System.out.println("in main method value = " + i);
    }
  }
}
