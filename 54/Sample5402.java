public class Sample5402 {
	enum SIGNAL {BLUE,YELLOW,RED};

	public static void alert(SIGNAL i) {
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
		SIGNAL i = SIGNAL.RED;
		alert(i);
		if(i == SIGNAL.RED) {
			System.out.println("よって通行禁止");
		}
	}

}
