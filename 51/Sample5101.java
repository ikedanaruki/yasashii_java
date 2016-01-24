import java.util.*;

public class Sample5101 {
	public static void main(String[] args) {
		Vector v = new Vector();
		for(int i = 0; i < 5; i++) {
			v.add(new Integer(i));
		}
		v.remove(new Integer(3));
		v.insertElementAt(new Integer(7),1);
		for(int i = 0; i < v.size(); i++) {
			Integer a = (Integer)v.get(i);
			System.out.println(a.intValue());
		}
	}

}
/*
C:\addjava>javac Sample5101.java
注: Sample5101.java の操作は、未チェックまたは安全ではありません。
注: 詳細については、-Xlint:unchecked オプションを指定して再コンパイルしてくださ
い。
C:\addjava>java Sample5101
0
7
1
2
4
*/