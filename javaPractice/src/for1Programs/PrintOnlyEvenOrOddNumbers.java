package for1Programs;

public class PrintOnlyEvenOrOddNumbers {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		for (int i = 1; i <= num; i++) {
			if (i % 2 != 0) { // i%2==0 if for even numbers // i%2!=0 is for Odd numbers
				System.out.println(i);
			}
		}
	}
}
