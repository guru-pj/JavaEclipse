package day3;

public class equalsIgnoreCase {
	public static void main(String[] args) {
		String n1 = "Dhoni";
		boolean r = n1.equalsIgnoreCase("DHONI");// checks for exact string but ignores case
		System.out.println(r);

		System.out.println(n1.equalsIgnoreCase("DHoni"));
		System.out.println(n1.equalsIgnoreCase("oni"));
		System.out.println(n1.equalsIgnoreCase("DhOni"));
		System.out.println(n1.equalsIgnoreCase("dhoni"));
		System.out.println(n1.equalsIgnoreCase("Dhon"));
	}

}
