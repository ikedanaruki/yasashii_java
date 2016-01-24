import java.io.*;

class Sample4202 {
  
  public static void main(String[] args) {
    
    try {
      BufferedReader in = new BufferedReader
	(new FileReader(args[0]));

      String s;
      while((s = in.readLine()) != null) {
	System.out.println(s);
      }
      in.close();
    }
    catch(IOException e) {
      System.out.println("入出力に関する例外が発生");
    }
  }
}				   
