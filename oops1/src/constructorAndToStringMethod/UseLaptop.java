package constructorAndToStringMethod;

public class UseLaptop {
	public static void main(String[] args) {
		Laptop l1 = new Laptop("Dell", 39000, 8, "Silver", true);
		Laptop l2 = new Laptop("Asus", 42000, 16, "Black", false);
		Laptop l3 = new Laptop("Apple", 91000, 8, "Grey", false);

		System.out.println(
				l1.getBrand() + " " + l1.getColour() + " " + l1.getRam() + " " + l1.getPrice() + " " + l1.getIsTouch());
		System.out.println(
				l2.getBrand() + " " + l2.getColour() + " " + l2.getRam() + " " + l2.getPrice() + " " + l2.getIsTouch());
		System.out.println(
				l3.getBrand() + " " + l3.getColour() + " " + l3.getRam() + " " + l3.getPrice() + " " + l3.getIsTouch());

		System.out.println();
		System.out.println();

		System.out.println(l1.toString());
		System.out.println(l2);
		System.out.println(l3);

	}

}
