package day3;

public class Split {
	public static void main(String[] args) {
		String s = "Hi How are You";

		String[] sA = s.split("Y");
		System.out.println(sA[0]);
		System.out.println(sA[1]);
		System.out.println(sA.length);
		System.out.println();

		String[] sA1 = s.split(" ");
		System.out.println(sA1[0]);
		System.out.println(sA1[1]);
		System.out.println(sA1[2]);
		System.out.println(sA1[3]);
		System.out.println(sA1.length);

		System.out.println();
		String[] sA2 = s.split("u"); // if we try with ?
		System.out.println(sA2[0]);
		System.out.println(sA2.length);
		// System.out.println(sA2[1]); // error

	}
}
