package programs;

public class TransientAndVolatileUse {

	String a = "Guru";
	transient String b = "Moorthy";
	volatile String c = "Raju";

	public static void main(String[] args) {

		// TransientAndVolatile t = new TransientAndVolatile();
		TransientAndVolatileUse t = new TransientAndVolatileUse();
		System.out.println(t.a);
		System.out.println(t.b);
		System.out.println(t.c);

	}
}
