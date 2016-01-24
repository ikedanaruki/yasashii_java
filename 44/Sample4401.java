class PrintNumber extends Thread {
  public void run() {
    for(int i = 0; i < 1000; i++) {
      System.out.println("value = " + i);
    }
  }
}

class Sample4401 {
  public static void main(String[] args) {
    PrintNumber o = new PrintNumber();
    o.start();
    catch(InterruptedException e) {}		
    for(int i = 0; i < 20; i++) {
      System.out.println("in main method value = " + i);
    }
  }
}
