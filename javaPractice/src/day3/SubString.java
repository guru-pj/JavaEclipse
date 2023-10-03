package day3;

public class SubString {
	public static void main(String[] args) {

		String s = "Java Programming Language";// index starts from 0

		String r = s.substring(5, 12);
		System.out.println(r); // prints Program

		System.out.println(s.substring(5, 11)); // prints Progra
		System.out.println(s.substring(5, 3)); // prints index out of boundry exception

	}

}
