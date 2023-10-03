package constructorAndToStringMethod;

public class UseMarker {
	public static void main(String[] args) {
		Marker m1 = new Marker("Camlin", 20, true, "Red");
		Marker m2 = new Marker("Natraj", 15, false, "Blue");
		Marker m3 = new Marker();
		System.out.println(m3.getBrand());

		System.out.println(m1.getBrand() + " " + m1.getPrice() + " " + m1.getIsRefillable() + " " + m1.getColour());
		System.out.println(m2.getBrand() + " " + m2.getPrice() + " " + m2.getIsRefillable() + " " + m2.getColour());
	}
}
