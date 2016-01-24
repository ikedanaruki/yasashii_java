import static enumtest.COLORS.SIGNAL;
import static enumtest.COLORS.SIGNAL.BLUE;
import static enumtest.COLORS.SIGNAL.YELLOW;
import static enumtest.COLORS.SIGNAL.RED;

public class Sample5503 {
	public static void main(String[] args) {
		SIGNAL i = RED;
		if(i == RED) {
			System.out.println("よって通行禁止");
		}
	}
}
