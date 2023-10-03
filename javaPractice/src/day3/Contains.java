package day3;

public class Contains {
	public static void main(String[] args) {
		String n1 = "Dhoni";
		boolean r = n1.contains("i"); //
		System.out.println(r);
		
		System.out.println(n1.contains("ho"));
		System.out.println(n1.contains("dh"));
		System.out.println(n1.contains("D"));
		System.out.println(n1.contains("Dhoni"));
		System.out.println(n1.contains("dhoni"));
		
	}

}
