package day3;

public class startsWith {

	public static void main(String[] args) {
		String n1 = "Dhoni";
		boolean r = n1.startsWith("D");
		System.out.println(r);

		System.out.println(n1.startsWith("ni"));
		System.out.println(n1.startsWith("oni"));
		System.out.println(n1.startsWith("Dh"));
		System.out.println(n1.startsWith("Dhoni"));
		System.out.println(n1.startsWith("dhoni"));

	}

}
