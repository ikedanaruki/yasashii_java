class GeneSwap<T> {
	T a;
	T b;
	GeneSwap(T x,T y) {
		a = x;
		b = y;
	}
	void print() {
		System.out.println(a);
		System.out.println(b);
	}
	void swap() {
		T c = null;
		c = a;
		a = b;
		b = c;
	}
}

public class Sample5308 {
	public static void main(String[] args) {
		GeneSwap<Integer> sw1 = new GeneSwap<Integer>(10,20);
		sw1.swap();	
		sw1.print();
		GeneSwap<Double> sw2 = new GeneSwap<Double>(2.5,3.14);
		sw2.swap();	
		sw2.print();
		GeneSwap<Float> sw3 = new GeneSwap<Float>(1.1f,2.2f);
		sw3.swap();	
		sw3.print();
	}
}


