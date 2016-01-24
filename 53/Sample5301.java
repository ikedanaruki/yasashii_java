import java.util.*;

public class Sample5301 {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(20);
		v.add(20.0);
		v.add(20.0f);
		v.add("２０");
		for(Object o : v) {
			System.out.print(o + " ");
		}
	}
}

