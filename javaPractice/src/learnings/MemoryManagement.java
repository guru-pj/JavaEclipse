package learnings;

public class MemoryManagement {

	public static void main(String[] args) {
//immutable StringConstantPoolMemory

		String a = "hello";
		System.out.println(a.hashCode());
		String b = "hello";
		System.out.println(b.hashCode());
		a = "guru";
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(Integer.toHexString(System.identityHashCode(a)));

// mutable ->heapMemory
//		StringBuffer a1 = new StringBuffer("hello");
//		StringBuffer b1 = new StringBuffer("hello");
//		System.out.println(a1.hashCode() + " " + b1.hashCode());
		
	}
}
