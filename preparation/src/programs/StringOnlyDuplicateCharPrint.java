package programs;

public class StringOnlyDuplicateCharPrint {
	public static void main(String[] args) {
		String s = "ramgurumoorthy";
//printing duplicates with count
		System.out.println("                              Duplicates with count");
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < s.length(); j++) {
				int c = 1;
				if (i == j) {
					break;
				} else if (s.charAt(i) == s.charAt(j)) {

					c++;
					// s.charAt(j)='Q';
					System.out.println(s.charAt(i) + " " + c);

				}
			}
		}
//printing duplicates with count
		System.out.println("                              Non Duplicates with count");

	}
}
