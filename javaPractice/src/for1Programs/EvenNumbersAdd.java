package for1Programs;

public class EvenNumbersAdd {
	public static void main(String[] args) {
		int temp = 0, num = Integer.parseInt(args[0]);
		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0) {
				temp = temp + i;
			}
		}
		System.out.println(temp);
	}
}
