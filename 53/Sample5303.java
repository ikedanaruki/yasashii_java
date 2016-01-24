public class Sample5303 {
	static void printSwap(Integer a,Integer b) {
		Integer c = null;
		c = a;
		a = b;
		b = c;
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		Integer a = 10;
		Integer b = 20;
		printSwap(a,b);
	}
}

