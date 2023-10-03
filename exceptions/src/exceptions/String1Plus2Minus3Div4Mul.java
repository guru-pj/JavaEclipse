package exceptions;

// input:String ->"5+3-2"  output->6
//https://www.geeksforgeeks.org/java-program-to-convert-char-to-int/
public class String1Plus2Minus3Div4Mul {
	public static void main(String[] args) {
		String s = "5+3-2";
		int a = 0;
		for (int i = 0; i < s.length(); i++) {
			int t = 0;
			if (i % 2 == 0) {
				t = (s.charAt(i) - '0');
				System.out.println(t);
				a = a + t;
			} else {
				t = s.charAt(i);
				System.out.println(s.charAt(i));
				a = a + t;
			}

		}
		System.out.println(a);

//		char c = 'a';
//		System.out.println((int) c);

	}
}
