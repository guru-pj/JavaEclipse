package interfaceWithCarExample;

public class Car implements Vehicle {

	int price = 700000, cc;
	String colour, model;

	public int findMileage() {

		return 20;

	}

	public int findNetPrice(int tax) {

		return price + (price * tax / 100);
	}
}
