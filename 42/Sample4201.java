import java.io.*;

class Sample4201 {
  
  public static void main(String[] args) {
    
    try {
      BufferedReader in = new BufferedReader
	(new InputStreamReader(System.in));

      String s = in.readLine();
      System.out.println("入力されたのは " + s);
    }
    catch(IOException e) {
      System.out.println("入出力に関する例外が発生");
    }
  }
}				   
