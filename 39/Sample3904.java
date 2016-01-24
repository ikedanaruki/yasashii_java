class OverMaxValueException extends Exception {
  public OverMaxValueException() {
    super();
  }
}

class Sample3904 {
  public static void main(String[] args)  {
    try {
      int i = 100;
      if(i > 10) {
	throw new OverMaxValueException();
      }
    }
    catch(OverMaxValueException e) {
      System.out.println("OverMaxValueException例外をキャッチ！");
    }
  }
}
  
  
    



