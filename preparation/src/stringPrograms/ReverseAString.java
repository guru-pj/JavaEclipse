package stringPrograms;

public class ReverseAString {
	public static void main(String[] args) {
//inbuilt
		StringBuffer s = new StringBuffer("Hello how are you?");
		System.out.println(s.reverse());
//no inbuilt using for
		String s1 = "Hello how are you?";
		String res = "";
		for (int i = s1.length() - 1; i >= 0; i--) {
			res = res + s1.charAt(i);
		}
		System.out.println(res);
//no inbuilt using while
		int n = s1.length() - 1;
		res = "";
		while (n >= 0) {
			res = res + s1.charAt(n);
			n--;
		}
		System.out.println(res);
	}
}
