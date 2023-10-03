package basics;

public class StaticKeyword {

//	*used for memory management	
//	*creates memory only once in the static memory
//	->can be used with methods(),variable and blocks
//	*static methods and variable can be called directly using its class name
//	*static methods cannot be overridden and static variables can be overridden 
//	*static block properties executes before the main method block

	public static void main(String[] args) {
		StaticKeyword s1 = new StaticKeyword();
		StaticKeyword s2 = new StaticKeyword();
		StaticKeyword s3 = new StaticKeyword();
	}

//  default variable
	int a = 0;
//	static variable	
	static int b = 0;

//	Constructor
	public StaticKeyword() {
		a++;
		System.out.print(a + " ");
		b++;
		System.out.print(b);
		System.out.println();
	}

//	static block
	static {
		System.out.println("Static Block");
	}

}
