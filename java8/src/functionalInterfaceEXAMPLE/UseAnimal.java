package functionalInterfaceEXAMPLE;

public class UseAnimal {
	static int a = 10;

	public static void main(String[] args) {
		// Animal cat = (x) -> System.out.println(x);
		// Animal rat = (x) -> System.out.println(x);
		// cat.eat("Eats rats");
		// rat.eat("Eats nuts");

//		Animal cat = () -> System.out.println("Eats rats");
//		Animal rat = () -> System.out.println("Eats nuts");
//		
//		cat.eat();
//		rat.eat();
		a = 20;
		System.out.println(a);
		Animal cat = () -> {

			return 10;
		};

		System.out.println(cat.eats());

	}
}
