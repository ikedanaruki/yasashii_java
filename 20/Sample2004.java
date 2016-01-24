class Sample2004 {
  public static void main(String args[]) {
    System.out.println("まわりはじめます");
    for(int i = 0; i < 3; i++) {
      for(int j = 0; j < 3; j++) {
	if(j == 1) continue;
        System.out.println("変数iの値は" + i + "で" + 
			   "変数jの値は" + j + "です");  
      }
    }
    System.out.println("まわりおわりました");
  }
}
