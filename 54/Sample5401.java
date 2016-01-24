public class Sample5401 {
	final static int BLUE = 1;
	final static int YELLOW = 2;
	final static int RED = 3;

	public static void alert(int i) {
		switch(i) {
		case BLUE:
		System.out.println("青です");
		break;
		case YELLOW:
		System.out.println("黄です");
		break;
		case RED:
		System.out.println("赤です");
		break;
		default:
		System.out.println("???");
		}
	}
	public static void main(String[] args) {
		int i = YELLOW;
		alert(i);
		i = 3;
		alert(i);
		i = -1;
		alert(i);

	}

}
