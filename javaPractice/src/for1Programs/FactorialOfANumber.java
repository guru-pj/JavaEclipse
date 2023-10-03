package for1Programs;

public class FactorialOfANumber {
	public static void main(String[] args) {
		int j = 1;
		int num = 10;
		for (int i = num; i >= 1; i--) {
			j = j * i;
		}
		System.out.println(j);
	}

}
