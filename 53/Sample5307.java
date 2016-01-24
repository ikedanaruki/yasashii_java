class Swap {
	Integer a;
	Integer b;
	Swap(Integer x,Integer y) {
		a = x;
		b = y;
	}
	void print() {
		System.out.println(a);
		System.out.println(b);
	}
	void swap() {
		Integer c = null;
		c = a;
		a = b;
		b = c;
	}
}

public class Sample5307 {
	public static void main(String[] args) {
		Swap sw = new Swap(10,20);
		sw.swap();	
		sw.print();
	}
}

