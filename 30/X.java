/*
 * コメントの使い方の例
 * アスタリスク(*)を左のように配置して見やすくする
 */

/**
 * Class Sample2904  クラス宣言に関するコメント
 * version 1.00
 * update 2001/09/09
 */
class X {
  /** 最大値 */
  static final int MAX = 100;

  /** 最小値 */
  final static int MIN = -100;

  /** 標準値 */
  final int DEFAULT = 10;
  
  /**
   * 最大値を表示
   */
  static void printMAX() {
    /* 表示を行う */
    System.out.println(X.MIN); /* これで表示完了 */
//  System.out.println(X.MIN); 
  }
}

