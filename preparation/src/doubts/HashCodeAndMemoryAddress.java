package doubts;

public class HashCodeAndMemoryAddress {
	public static void main(String[] args) {
		String a = "guru";
		System.out.println(a.hashCode());
		System.out.println(Integer.toHexString(a.hashCode()) + "\n");

		int[] iA = { 1, 2, 3, 4, 5 };
		System.out.println(iA);
		System.out.println(iA.hashCode());
		System.out.println(Integer.toHexString(iA.hashCode()));
	}
}
