package day3;

public class indexOf {

	public static void main(String[] args) {
		String s = "Guru Moorthy";

		int c = s.indexOf('G'); // gives numbers so saved in int //case sensitive
		System.out.println(c);

		System.out.println(s.indexOf(' '));
		System.out.println(s.indexOf('y'));
		System.out.println(s.indexOf('g'));// no error prints -1
		System.out.println(s.indexOf('d'));// no error prints -1
		
		

	}

}
