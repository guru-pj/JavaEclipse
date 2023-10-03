package basics;

public class Final0Finally0Finalize {
//	*final is keyword 
//	*finally is a block
//	*finalize() is predefined method in Object Class
//	
//	
//	
	@Override
	public void finalize() {
		System.out.println("Collected");
	}

	public static void main(String[] args) {

		Final0Finally0Finalize f1 = new Final0Finally0Finalize();
		System.out.println(f1); // prints memory Address
		System.out.println(f1.hashCode()); // prints the hashcode

		f1 = new Final0Finally0Finalize(); // re-initializing(creating new memory) the same object
		System.out.println(f1);
		System.out.println(f1.hashCode());
		System.gc(); // prints only if the old memory is collected by garbage

		f1 = new Final0Finally0Finalize();
		System.gc();
		System.gc();// does'nt prints
		System.gc();// does'nt prints
	}
}
