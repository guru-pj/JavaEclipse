package day3;

public class endsWith {
	public static void main(String[] args) {
		String n1 = "Dhoni";
		boolean r = n1.endsWith("i");
		System.out.println(r);

		System.out.println(n1.endsWith("ni"));
		System.out.println(n1.endsWith("oni"));
		System.out.println(n1.endsWith("Dh"));
		System.out.println(n1.endsWith("Dhoni"));
		System.out.println(n1.endsWith("dhoni"));
	}

}
