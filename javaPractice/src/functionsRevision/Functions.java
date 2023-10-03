package functionsRevision;

public class Functions {

	public int[] ConvertToIntArray(String x) {
		String[] s = x.split(",");
		int[] a = new int[s.length];
		for (int i = 0; i < a.length; i++) {
			a[i] = Integer.parseInt(s[i]);
		}
		return a;
	}

	public void PrintEvenArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				System.out.println(a[i]);
			}
		}
	}

	public String reversingString(String a) {

		String rev = "";
		for (int i = a.length() - 1; i >= 0; i--) {
			rev = rev + a.charAt(i);
		}
		return rev;
	}

	
	
	
}
