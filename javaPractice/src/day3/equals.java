package day3;

public class equals {
	public static void main(String[] args) {
		String n1 = "Dhoni";
		boolean r = n1.equals("Dhoni");// checks for exact string with exact casez
		System.out.println(r);

		System.out.println(n1.equals("DHoni"));
		System.out.println(n1.equals("oni"));
		System.out.println(n1.equals("DhOni"));
		System.out.println(n1.equals("dhoni"));
		System.out.println(n1.equals("Dhon"));
	}

}
