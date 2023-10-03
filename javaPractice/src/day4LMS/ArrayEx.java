package day4LMS;

public class ArrayEx {
	public static void main(String[] args) {
		String sample = "hello";

		String x[] = sample.split("l");
		System.out.println(x[0]);// prints he
		System.out.println(x[1]);// prints space[consecutive same word is considered as space]
		System.out.println(x[2]);// prints o
	}
}
