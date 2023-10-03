package functionsRevision;

public class UseFunctions {
	public static void main(String[] args) {
		Functions f = new Functions();

		int[] iA = f.ConvertToIntArray(args[0]);
		f.PrintEvenArray(iA);

		System.out.println(f.reversingString("Guru"));

		// char c=0;
		// String s1=null;
		// String s2="";
		// int i=0;
		// boolean b=true;
	}
}
