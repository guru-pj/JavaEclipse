package staticAndDefault;

public class MemoryExample {
	static int c = 0; //stores in stack memory

	public MemoryExample() {
		c++;
		System.out.println(c);
	}

	public static void main(String[] args) {
		MemoryExample c1 = new MemoryExample();
		MemoryExample c2 = new MemoryExample();
		MemoryExample c3 = new MemoryExample();
		System.out.println(MemoryExample.c);
	}

}
