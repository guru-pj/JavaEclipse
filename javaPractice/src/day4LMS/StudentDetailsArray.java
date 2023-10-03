package day4LMS;

public class StudentDetailsArray {
	public static void main(String[] args) {

		String[] s = args[0].split(",");

		String n = (s[0]);
		int age = Integer.parseInt(s[1]);
		String d = (s[2]);
		float f = Float.parseFloat(s[3]);
		boolean b = Boolean.parseBoolean(s[4]);

		System.out.println(n);
		System.out.println(age);
		System.out.println(d);
		System.out.println(f);
		System.out.println(b);

	} 
}
