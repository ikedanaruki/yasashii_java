import java.io.*;

class Sample3903 {

  public static void m() throws FileNotFoundException {
    //    FileInputStream f = new FileInputStream("Sample.java");
  }

  public static void main(String[] args)  {
    try {
      m();
      int i[] = new int[10];
      i[20] = 100;
    }
    catch(FileNotFoundException e) {
      System.out.println("ファイル入出力関係の例外が発生しました");
    }
    //    catch(ArrayIndexOutOfBoundsException e) {
    //  System.out.println("配列の添字が不正なので例外が発生しました");
    //}
    catch(Exception e) {
      System.out.println("例外が発生しましたよ");
    }
  }
}
  
  
    
