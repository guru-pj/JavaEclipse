package interfaceAbstractClassAndClass;

public abstract class SmartPhone implements Electronics {

	public String category() {
		return "Mobile(SmartPhone)";
	}

	public int Price(int price) {
		return price;
	}

	public String colour(String c) {
		return c;
	}

	public abstract String model(String m);

	public String brand(String brand) {
		return brand;
	}
}
