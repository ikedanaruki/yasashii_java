import java.util.*;

public class Sample5202 {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector();
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
		for(Object o : v) {
			System.out.print(o + " ");
		}
	}
}

