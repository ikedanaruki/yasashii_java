public class Sample5306 {
	static <T> void printSwap(T a,T b) {
		T c = null;
		c = a;
		a = b;
		b = c;
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		Integer a = 10;
		Integer b = 20;
		Double c = 2.5;
		Double d = 3.14;
		Float e = 1.1f;
		Float f = 2.2f;
		printSwap(a,b);
		printSwap(c,d);
		printSwap(e,f);
	}
}

