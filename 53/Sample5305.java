public class Sample5305 {
	static void printSwap(Integer a,Integer b) {
		Integer c = null;
		c = a;
		a = b;
		b = c;
		System.out.println(a);
		System.out.println(b);
	}
	static void printSwap(Double a,Double b) {
		Double c = null;
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
		printSwap(a,b);
		printSwap(c,d);
	}
}

