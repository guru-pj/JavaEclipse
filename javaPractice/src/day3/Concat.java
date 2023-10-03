package day3;

public class Concat {
	public static void main(String[] args) {
		String n1 = "Guru";
		String n2 = "Moorthy";

		String myName = n1.concat(n2);// joins two Strings
		System.out.println(myName);

		String fatherName = "Raju";

		String fullName = myName.concat(fatherName);
		System.out.println(fullName);
		int n = fullName.length();
		System.out.println(n);

	}

}
