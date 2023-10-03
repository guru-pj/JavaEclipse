package day4LMS;

public class ArgSampleCommaSeperator {
	public static void main(String[] args) {
		// without split
		String s1 = args[0];
		System.out.println(s1);

		// with split
		String[] s2 = args[0].split(",");
		System.out.println(s2[0]);
		System.out.println(s2[1]);
	}

}
