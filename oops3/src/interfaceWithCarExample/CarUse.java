package interfaceWithCarExample;

public class CarUse {
	public static void main(String[] args) {
		Car c = new Car();
		c.cc = 1000;
		// c.price = 700000;

		System.out.println(c.findMileage());
		System.out.println(c.findNetPrice(10));

		Vehicle v = new Car();
		System.out.println(v.findMileage());
		System.out.println(v.findNetPrice(10));
		
	}
}
