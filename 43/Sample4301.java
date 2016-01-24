import java.io.*;

class Sample4301 {
  public static void main(String[] args) {
    try {
      BufferedWriter out = new BufferedWriter
	(new FileWriter(args[0]));
      out.write("This is a pen.");
      out.newLine();
      out.write("This is a book.");
      out.newLine();
      out.close();
    }
    catch(IOException e) {
      System.out.println("入出力に関する例外が発生");
    }
  }
}
      
