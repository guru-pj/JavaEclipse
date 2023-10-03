package java8;

public class PrintNonVowelsUsingLambda {
	public static void main(String[] args) {

		String[] sA = { "guru", "dilip", "Vishnu", "ae", "pp", "hgdz", "kjhvsb" };
		PrintNonVowelsInterface print = (x) -> {
			for (int i = 0; i < x.length; i++) {
				if (x[i].contains("a") || x[i].contains("e") || x[i].contains("i") || x[i].contains("o")
						|| x[i].contains("u")) {
					continue;
				} else {
					System.out.println(x[i]);
				}
			}

		};
		print.printNonVowels(sA);
	}
}
