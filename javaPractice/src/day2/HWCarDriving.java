package day2;

public class HWCarDriving {
	String brand;
	int price;

	public String up() {
		return "Car is moving Forward"; // have to use SOPln to print
	}

	// or
	public void forward() {
		System.out.println("Car is moving Forward"); // just call the method which has SOPln
	}

	public String down() {
		return "Car is moving Backward";
	}

	// or
	public void backward() {
		System.out.println("Car is moving Backward");
	}

	public String left() {
		return "Car is moving towards Left";
	}

	// or
	public void l() {
		System.out.println("Car is moving towards Left");
	}

	public String Right() {
		return "Car is moving towards Right";
	}

	// or
	public void r() {
		System.out.println("Car is moving towards Right");
	}

	public String stop() {
		return "Car stops";
	}

	// or
	public void s() {
		System.out.println("Car stops");
	}

}
