import java.util.*;

public class Sample5102 {
	public static void main(String[] args) {
		Vector v = new Vector();
		for(int i = 0; i < 5; i++) {
			v.add(i);
		}
		System.out.println("----------");
		for(int i = 0; i < v.size(); i++) {
			System.out.print(v.get(i) + " ");
		}
		v.remove(3);
		v.insertElementAt(7,1);
		System.out.println("\n----------");
		for(int i = 0; i < v.size(); i++) {
			System.out.print(v.get(i) + " ");
		}
	}
}

/*
----------
0 1 2 3 4
----------
0 7 1 2 4
*/
