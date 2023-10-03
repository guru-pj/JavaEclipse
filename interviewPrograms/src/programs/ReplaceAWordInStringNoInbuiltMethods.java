package programs;

import java.util.Arrays;

public class ReplaceAWordInStringNoInbuiltMethods {
	public static void main(String[] args) {
		String a = "Hi This is Gurumoorthy from Chennai";
		String b = a.replace("Chennai", "Bangalore");
		System.out.println(b);
		// System.out.println(a.replace("Chennai", "Bangalore"));
		char[] c = a.toCharArray();
		System.out.println(c.length);
		System.out.println(Arrays.toString(c));
		int s = 0, e = 0;

		for (int i = 0; i < c.length - 6; i++) {
			// int t = 0;
			// int s = 0, e = 0;
			if ((c[i] == 'c' || c[i] == 'C')) {
				s = i;
				for (int j = i; j < i + 7; j++) {
					if (c[j] == ' ')
						break;
					else if (c[j] == 'i' || c[j] == 'I')
						e = j;
//					if((c[j]=='i'||c[j]=='I') && c[j]){
//						
//					}
				}
//				if ((c[i + 6] == 'i' || c[i + 6] == 'I') && c[i + t] != ' ') {
//
//					break;
//				}
			}
			// System.out.println(t);
			// t++;
		}
		System.out.println(s);
		System.out.println(e);

		String n = "Bangalore";
		if (s != 0 && e != 0) {
			for (int i = s; i <= e; i++) {
				// a[i]
			}

		}
	}
}
