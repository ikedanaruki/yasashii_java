public class Sample5602 {
	static int sum(int... numbers) {
	System.out.println("和を計算する数は" +numbers.length + "個です");
	int sum = 0;
	for(int i : numbers)
		sum = sum + i;
		return sum;
	}

	public static void main(String[ ] args) {
		int total = sum(1,2,3,4,5,6,7,8,9,10);
		System.out.println("合計は" + total);
	}
}

