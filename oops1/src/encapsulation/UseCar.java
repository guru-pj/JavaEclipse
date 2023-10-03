package encapsulation;

public class UseCar {
	public static void main(String[] args) {
		Car c1 = new Car();

		c1.setBrand("BMW");
		c1.setColour("Red");
		c1.setPrice(2000000);
		c1.setDisAmount(100000);

		System.out.println(c1.getBrand());
		System.out.println(c1.getColour());
		System.out.println(c1.getPrice());
		System.out.println(c1.getDisAmount());
		c1.setNetPrice(c1.getPrice() - c1.getDisAmount());
		System.out.println(c1.getNetPrice());
	}
}
