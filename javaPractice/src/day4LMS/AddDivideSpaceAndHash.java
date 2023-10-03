package day4LMS;

public class AddDivideSpaceAndHash {
	public static void main(String[] args) {

		int c = Integer.parseInt(args[1]);

		String[] s = args[0].split("#");

		int a = Integer.parseInt(s[0]);
		int b = Integer.parseInt(s[1]);

		int res = (a / b) + c;
		System.out.println(res);

	}

}
