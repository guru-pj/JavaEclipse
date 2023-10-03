package interfaceAbstractClassAndClass;

public class UseClass {
	public static void main(String[] args) {
		Samsung s = new Samsung();
		String model = "Galaxy s23 Ultra";

		System.out.println(s.brand("Samsung"));
		System.out.println(s.category());
		System.out.println(s.model(model));
		System.out.println(s.colour("Red"));
		System.out.println(s.Price(14999));

	}
}
